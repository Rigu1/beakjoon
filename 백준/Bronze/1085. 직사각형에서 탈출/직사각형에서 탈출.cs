using System;

class Program
{
    public static void Main(string[] args)
    {
        int[] input = Console.ReadLine()!.Split(' ').Select(int.Parse).ToArray();
        int minHeight = input[0];
        int minWidth = input[1];

        if (input[2] - input[0] < minHeight)
        {
            minHeight = input[2] - input[0];
        }

        if (input[3] - input[1] < minWidth)
        {
            minWidth =  input[3] - input[1];
        }

        if (minWidth < minHeight)
        {
            Console.WriteLine(minWidth);
            return;
        }
        
        Console.WriteLine(minHeight);
    }
}