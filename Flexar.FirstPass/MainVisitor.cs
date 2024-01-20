
using System.Security.Cryptography.X509Certificates;
using Antlr4.Runtime.Misc;
using Flexar.Utils;

namespace Flexar.FirstPass;

public class MainVisitor : FlexarBaseVisitor<BaseVisitorReturn>
{
    public override BaseVisitorReturn VisitProgram([NotNull] FlexarParser.ProgramContext context)
    {
        context.children.ToList().ForEach(child => {
            if (child is FlexarParser.NamespaceContext) {
                var namespaceContext = child as FlexarParser.NamespaceContext;
                var namespaceVisitor = new NamespaceVisitor();
                namespaceVisitor.VisitNamespace(namespaceContext);
            }
        });
        return new BaseVisitorReturn();
    }
}

