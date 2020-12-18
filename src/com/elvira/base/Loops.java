package com.elvira.base;

public class Loops
{
    //Find the sum of even numbers and their number in the range from 1 to 99
    public static int[] sumAndCountEvenElements()
    {
        int sum = 0, count = 0;
        for (int i = 1; i < 99; i++) {
            if (i % 2 == 0)
            {
                sum += i;
                count++;
            }
        }
        return new int[] {sum, count};
    }
    //Check if the number is prime (a number is called prime if it is divisible only by itself and by 1)
    public static boolean isPrimeNumber(int in)
    {
        boolean response = true;
        for (int i = 2; i < in; i++) {
            if (in % i == 0)
            {
                response = false;
            }
        }
        return response;
    }
    //Find the root of a natural number up to integer (consider the sequential selection option and the binary search method)
    // Sequential selection option
    public static int mySqrtChecking (int a)
    {
        int i = 1;
        while (i * i <= a)
        {
            i++;
        }
        return i - 1;
    }
    //Binary search method
    public static int mySqrtBinSearch(int a)
    {
        int response = a;
        while (response * response > a) {
            response /=2;
        }
        while (response * response < a) {
            response++;
        }
        return response;
    }
    //Calculate the factorial of number n. n! = 1*2...*n-1*n;!
        public static int myFactorial(int a)
        {
            int response = 1;
            if (a > 1)
            {
                for (int i = 2; i <= a; i++)
                {
                    response *= i;
                }
            }
            return response;
        }
        //Calculate the sum of digits of a given number
        public static int sumbOfNumbers(int a)
        {
            int result = 0;
            while (a != 0)
            {
                result =+ a % 10;
                a /= 10;
            }
            return result;
        }


        //Print a number that is a mirror image of digits of a given number, for example, the number 123 is given, print 321. public static intNumbers (int a)
        public static int reversNumbers(int a)
    {
         int result = 0;
        while (a > 0) {
            result = (result + (a % 10)) * 10;
            a = a / 10;
        }
        return result / 10;

    }
}

