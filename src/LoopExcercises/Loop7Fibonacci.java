package LoopExcercises;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Loop7Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//14.Fibonacci number
        /*int number;
        int num1 = 0;
        int num2 = 1;
        int sum;

        System.out.println("Please enter number");
        number= sc.nextInt();

        System.out.println(num1 + " " + num2 + " ");

        for(int i = 3; i<=number; i++){

            sum = num1 + num2;
            System.out.println(sum+ " ");

           num1=num2;
           num2 = sum;

        }*/

//15.Write a program to calculate the sum of following series where n is input by user.
        // 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n

     /*   int number;

        System.out.println("Please enter number");
        number =sc.nextInt();

        double sum = 0;


        for(int i = 1; i<=number; i++){
            sum+=1.0  /i;



        }
        System.out.println(sum);*/


        //16.Compute the natural logarithm of 2, by adding up to n terms in the series
        //1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
        //where n is a positive integer and input by user.

        int number;
        double sum = 0;
        int sign = 1;

        System.out.println("Please enter number");
        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {

            sum += (sign * 1.0) / i;
            sign = sign * -1;
        }
        System.out.println(sum);
    }
}