using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Flexar.Error
{
    public class ErrorController
    {
        public static Dictionary<string, List<string>> Errors { get; set; } = new();

        public static void AddError(string fileName, int line, int charPositionInLine, string msg)
        {
            if (!Errors.ContainsKey(fileName))
            {
                Errors.Add(fileName, new List<string>());
            }

            Errors[fileName].Add($"Error on {fileName}:{line}:{charPositionInLine} - {msg}");
        }

        public static void PrintErrors()
        {
            foreach (string errorFile in Errors.Keys)
            {
                foreach (string message in Errors[errorFile])
                {
                    Console.WriteLine($"{errorFile}:");
                    Console.WriteLine($"\t{message}");
                    Console.WriteLine("==================");
                }
            }
        }
    }
}
