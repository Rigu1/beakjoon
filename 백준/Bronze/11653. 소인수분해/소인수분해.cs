using System;

class Program
{
    public static void Main(string[] args)
    {
        int input = int.Parse(Console.ReadLine()!);
        
        if (input <= 1)
        {
            return;
        }
        
        var output = new List<int>();
        
        while (input % 2 == 0)
        {
            output.Add(2);
            input /= 2;
        }

        for (int i = 3;  i * i <= input ; i += 2)
        {
            while (input % i == 0)
            {
                output.Add(i);
                input /= i;
            }
        }

        if (input > 1)
        {
            output.Add(input);
        }
        
        Console.WriteLine(string.Join('\n', output));
    }
}