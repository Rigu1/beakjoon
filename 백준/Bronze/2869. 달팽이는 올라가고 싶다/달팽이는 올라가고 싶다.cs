using System;


public class Program
{
    public static void Main(string[] args)
    {
        int[] input = Console.ReadLine()!.Split(' ').Select(int.Parse).ToArray();

        int add = input[0];
        int sub = input[1];
        int target = input[2];
        
        int targetHeightBeforeLastDay = target - add;
        
        int climbDay = add - sub;

        int days = targetHeightBeforeLastDay / climbDay;

        if (targetHeightBeforeLastDay % climbDay != 0)
        {
            days++;
        }

        Console.WriteLine(days + 1);
    }
}