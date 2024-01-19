
using Antlr4.Runtime;
using Flexar.FirstPass;
using Flexar.Error;

namespace Flexar.Main;

class ProcessFile {

    string filePath;

    FlexarParser? parser;
    FlexarLexer? lexer;

    public ProcessFile(string filePath)
    {
        this.filePath = filePath;
    }


    public void Process()
    {
        Console.WriteLine($"Processando arquivo: {filePath}");

        // Aqui você lê o conteúdo do arquivo
        string input = File.ReadAllText(filePath);

        // E aqui você aplica o lexer e o parser
        
        CommonTokenStream tokenStream = ExecuteLexer(input);
        FlexarParser.ProgramContext program = ExecuteParser(tokenStream);
        Console.WriteLine("Erros: " + parser.NumberOfSyntaxErrors);
        if (parser.NumberOfSyntaxErrors > 0) return;
        MainVisitor visitor = new MainVisitor();
        visitor.Visit(program);
        

        Console.WriteLine("Arquivo processado com sucesso.");
    }

    CommonTokenStream ExecuteLexer(string input){
        AntlrInputStream inputStream = new AntlrInputStream(input);
        lexer = new FlexarLexer(inputStream);
        lexer.RemoveErrorListeners();
        lexer.AddErrorListener(new LexerErrorListener() { fileName = filePath });
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        return tokenStream;
    }

    FlexarParser.ProgramContext ExecuteParser(CommonTokenStream tokenStream){
        parser = new FlexarParser(tokenStream);
        parser.RemoveErrorListeners();
        parser.AddErrorListener(new ParserErrorListener() { fileName = filePath });
        FlexarParser.ProgramContext? program = parser.program();
        return program;
    }

}

