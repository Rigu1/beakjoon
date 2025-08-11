using System;


public class Program
{
    public static void Main(string[] args)
    {
        var output = new List<string>();
        
        while (true)
        {
            int[] input = Console.ReadLine()!.Split(" ").Select(int.Parse).ToArray();
            if (input[0] == 0 || input[1] == 0)
            {
                break;
            }

            if (input[0] % input[1] == 0)
            {
                output.Add("multiple");
                continue;
            }

            if (input[1] % input[0] == 0)
            {
                output.Add("factor");
                continue;
            }
            
            output.Add("neither");
        }
        
        Console.WriteLine(string.Join('\n', output));
    }
}