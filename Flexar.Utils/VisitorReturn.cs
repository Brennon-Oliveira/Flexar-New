
namespace Flexar.Utils;

public class VisitorReturn<T> : BaseVisitorReturn {
    public T Value { get; set; }
    public bool HasValue { get; set; }
    public VisitorReturn(T value) {
        Value = value;
        HasValue = true;
    }
    public VisitorReturn() {
        HasValue = false;
    }
}