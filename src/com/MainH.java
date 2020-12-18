package com.elvira;

import com.elvira.base.Loops;

import java.util.Scanner;

public class Main {

    public static void main(String args []) {
        System.out.println("Find the sum of even numbers and their number in the range from 1 to 99");
        int[] res= Loops.sumAndCountEvenElements();
        System.out.println(res[0]);
        System.out.println(res[1]);


        System.out.println("Check if the number is prime (a number is called prime if it is divisible only by itself and by 1)");
        System.out.println("Input a number:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(Loops.isPrimeNumber(num));


        System.out.println("Find the root of a natural number up to integer (consider the sequential selection option and the binary search method).Sequential selection option");
        System.out.println("Input a number:");
        int masha = in.nextInt();
        System.out.println(Loops.mySqrtChecking(masha));


        System.out.println("Binary search method");
        System.out.println("Input a number");
        int mashenbka = in.nextInt();
        System.out.println(Loops.mySqrtBinSearch(mashenbka));


        System.out.println("Calculate the factorial of number n. n! = 1*2...*n-1*n;!");
        System.out.println("Input a number");
        int maaasha = in.nextInt();
        System.out.println(Loops.myFactorial(maaasha));


        System.out.println("Calculate the sum of digits of a given number");
        System.out.println("Input a number");
        int nemasha = in.nextInt();
        System.out.println(Loops.sumbOfNumbers(nemasha));



        System.out.println("Print a number that is a mirror image of digits of a given number, for example, the number 123 is given, print 321. public static intNumbers (int a)");
        System.out.println("Input a number");
        int maria =  in.nextInt();
        System.out.println(Loops.reversNumbers(maria));
        

    }


}
