
using Antlr4.Runtime;
using Flexar.Error;
using Flexar.FirstPass;

namespace Flexar.Main;

class Program
{
    static void Main(string[] args)
    {
        if (args.Length != 1)
        {
            Console.WriteLine("Por favor, forneça um diretório.");
            return;
        }

        string directory = args[0];
        ProcessDirectory(directory);
    }

    static void ProcessDirectory(string directoryPath)
    {
        // Processar todos os arquivos .fl no diretório
        foreach (string file in Directory.GetFiles(directoryPath, "*.fl"))
        {
            ProcessFile processFile = new ProcessFile(file);
            processFile.Process();
        }

        // Recursivamente processar subdiretórios
        foreach (string subDirectory in Directory.GetDirectories(directoryPath))
        {
            ProcessDirectory(subDirectory);
        }

        // Imprimir erros
        ErrorController.PrintErrors();
    }

    
}

