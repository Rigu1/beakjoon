using System;

class Program
{
    public static void Main(string[] args)
    {
        int height = int.Parse(Console.ReadLine()!);
        int width = int.Parse(Console.ReadLine()!);
        
        Console.Write(height * width);
    }
}