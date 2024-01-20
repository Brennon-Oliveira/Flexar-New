using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Flexar.Utils.Data
{

    public class Function
    {
        public string Name { get; set; }
        public string ReturnType { get; set; }
        public Dictionary<string, string> Parameters { get; set; } = new Dictionary<string, string>();
    }
    public class Namespace
    {
        public string Name { get; set; }
        public Dictionary<string, Function> Functions { get; set; } = new Dictionary<string, Function>();
    }
    public class ProgramStructure
    {
        public Dictionary<string, Namespace> Namespaces { get; set; } = new Dictionary<string, Namespace>();
    }
}