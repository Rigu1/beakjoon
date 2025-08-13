using System;

class Program
{
    public static void Main(string[] args)
    {
        int start = int.Parse(Console.ReadLine()!);
        int end = int.Parse(Console.ReadLine()!);
        
        var result = new List<int>();

        for (int i = start; i <= end; i++)
        {
            if (IsPrime(i))
            {
                result.Add(i);
            }
        }

        if (result.Count == 0)
        {
            Console.WriteLine(-1);
            return;
        }
        Console.WriteLine($"{result.Sum()}\n{result[0]}");
    }

    public static bool IsPrime(int num)
    {
        if (num == 1)
        {
            return false;
        }
        
        for (int i = 2; i <= Math.Sqrt(num); i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        
        return true;
    }
}