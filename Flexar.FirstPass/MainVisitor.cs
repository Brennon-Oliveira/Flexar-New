
using Antlr4.Runtime.Misc;

namespace Flexar.FirstPass;

public class MainVisitor : FlexarBaseVisitor<Object>
{
    public override object VisitProgram([NotNull] FlexarParser.ProgramContext context)
    {
        return base.VisitProgram(context);
    }
}
