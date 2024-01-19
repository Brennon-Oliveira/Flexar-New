
using Antlr4.Runtime;

namespace Flexar.Error;

public class ParserErrorListener : IAntlrErrorListener<IToken>
{

    public string fileName { get; set; } = "unknown";

    public void SyntaxError(TextWriter output, IRecognizer recognizer, IToken offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
    {
        ErrorController.AddError(fileName, line, charPositionInLine, msg);
    }
}
