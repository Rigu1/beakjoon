using System;

class Program
{
    public static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine()!);
        int[] nums = Console.ReadLine()!.Split(' ').Select(int.Parse).ToArray();
        int count = 0;

        foreach (int num in nums)
        {
            if (IsPrime(num))
            {
                count += 1;
            }
        }

        Console.WriteLine(count);
    }

    public static bool IsPrime(int num)
    {
        if (num == 1) return false;
        
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