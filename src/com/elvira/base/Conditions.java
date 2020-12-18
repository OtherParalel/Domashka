package com.elvira.base;

public class Conditions {
    // if a - even number count a*b, otherwise a+b
    public static int getSumOMultirAdd(int a, int b) {
        int response;
        if (a % 2 == 0) {
            response = a * b;
        } else {
            response = a + b;
        }
        return response;
    }

    // Deternmine which quarter belongs to the point with coordinates (x,y)
    public static int findQuarter(int a, int b)
    {
        int response;
        if (a > 0 && b > 0)
        {
            response = 1;
        }
        else if (a < 0 && b > 0)
        {
            response = 2;
        }
        else if (a < 0 && b < 0)
        {
            response = 3;
        }
        else response = 4;
        return response;
    }

    // Find the sum of only the positive of the three numbers
    public static int sumOfPositiveElements(int a, int b, int c) {
        int response = 0;
        if (a > 0) {
            response += a;
        }
        if (b > 0) {
            response += b;
        }
        if (c > 0) {
            response += c;
        }
        return response;
    }

    //Calcullate the expression max(a*b*c, a+b+c)+3
    public static int calculateMax(int a, int b, int c) {
        int response;
        int x = a * b * c;
        int y = a + b + c;
        if (x > y) {
            response = x;
        } else response = y;
        return response + 3;
    }

    //Write a grading program based on the following rules
    public static char findStudentMark(int a) {
        char response = 0;
        if (a >= 0 && a <= 19) {
            response = 'F';
        } else if (a >= 20 && a <= 39) {
            response = 'E';
        } else if (a >= 60 && a <= 74) {
            response = 'C';
        } else if (a >= 75 && a <= 89) {
            response = 'B';
        } else if (a >= 90 && a <= 100) {
            response = 'A';
        }
        return response;
    }

}
