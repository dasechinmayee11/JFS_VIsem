package com.su2;

import java.util.Scanner;

public class App
{
    public static boolean check_prime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number:");
        int start = sc.nextInt();

        System.out.println("Enter ending number:");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++)
        {
            if (check_prime(i))
                System.out.print(i + " ");
        }

        sc.close();
    }
}
