using System;

class Program
{
    public static void Main(string[] args)
    {
        int[] input = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
        int result = 0;
        int count = 0;

        for (int i = 1; i <= input[0]; i++)
        {
            if (input[0] % i == 0)
            {
                count += 1;
            }
            
            if (count == input[1])
            {
                result = i;
                break;
            }
        }
        
        Console.WriteLine(result);
    }
}