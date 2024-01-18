
using Antlr4.Runtime;

namespace Flexar;

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
            ProcessFile(file);
        }

        // Recursivamente processar subdiretórios
        foreach (string subDirectory in Directory.GetDirectories(directoryPath))
        {
            ProcessDirectory(subDirectory);
        }
    }

    static void ProcessFile(string filePath)
    {
        Console.WriteLine($"Processando arquivo: {filePath}");

        // Aqui você lê o conteúdo do arquivo
        string input = File.ReadAllText(filePath);

        // E aqui você aplica o lexer e o parser
        AntlrInputStream inputStream = new AntlrInputStream(input);
        FlexarLexer lexer = new FlexarLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        FlexarParser parser = new FlexarParser(tokenStream);

        parser.program();

        Console.WriteLine("Arquivo processado com sucesso.");
    }
}

