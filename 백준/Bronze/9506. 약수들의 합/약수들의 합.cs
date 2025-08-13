using System;

class Program
{
    public static void Main(string[] args)
    {
        var input = new List<int>();
        var output = new List<string>();
        
        while (true)
        {
            int num = int.Parse(Console.ReadLine()!);
            
            if (num == -1)
            {
                break;
            }
            
            input.Add(num);
        }

        foreach (var num in input)
        {
            if (TryPerfect(num, out List<int> divisors))
            {
                output.Add($"{num} = {string.Join(" + ", divisors)}");
                continue;
            }
            
            output.Add($"{num} is NOT perfect.");
        }
        
        Console.WriteLine(string.Join('\n', output));
    }

    public static bool TryPerfect(int num,  out List<int> result)
    {
        var divisors =  new List<int>();
        
        for (int i = 1; i < num; i++)
        {
            if (num % i == 0)
            {
                divisors.Add(i);
            }
        }

        if (divisors.Sum() != num)
        {
            result =  new List<int>();;
            return false;
        }
        
        result = divisors;
        return true;
    }
}