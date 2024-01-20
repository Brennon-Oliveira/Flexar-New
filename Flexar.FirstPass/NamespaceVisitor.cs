
using Antlr4.Runtime.Misc;
using Flexar.Utils;

namespace Flexar.FirstPass;

public class NamespaceVisitor: FlexarBaseVisitor<BaseVisitorReturn> {
    public override BaseVisitorReturn VisitNamespace([NotNull] FlexarParser.NamespaceContext context)
    {

        var namespaceName = context.namespace_name().GetText();
        

        return base.VisitNamespace(context);
    }
}

