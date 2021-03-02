package LoopExcercises;

import java.util.Scanner;

public class Loop1 {
    public static void main (String[] args){
//
//        for(int i = 0;i<= 10; i++){
//            System.out.println(i);
//1. Write a program to calculate the sum of first 10 natural number.

      /*  int sum = 0;
        for (int i = 1; i<=10; i++){

            sum+=i;
            System.out.println(sum);*/

            //2. Write a program that prompts the user to input a positive integer.
            // It should then print the multiplication table of that number.

       /* Scanner sc = new Scanner(System.in);

        System.out.println("Print positive number");
        int positiveNumber = sc.nextInt();

        for(int i = 1; i<=10; i++){
            positiveNumber*=i;
            System.out.println(positiveNumber);*/


        //3.Write a program to find the factorial value of any number entered through the keyboard.

      /*  Scanner sc= new Scanner(System.in);

        int anyNumber; // to hold number;
        long factorial=1;

        System.out.println("Enter any positive integer");
        anyNumber= sc.nextInt();

        for( int i = 1; i<=anyNumber; i++) {
            factorial *= i;
        }
        System.out.println("Factorial value is " + factorial);*/

        // 4.Two numbers are entered through the keyboard.
        // Write a program to find the value of one number raised to the power of another.
        // (Do not use Java built-in method)

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2Power = sc.nextInt();

        int result = 1;

        for (int i = 1; i<num2Power; i++){
            num1= num2Power*num1;

        }
         // or via built-in Math method
        // static double power (int num1, int2Pow){
       // return Math.pow(num1,num2Power);


    }
    }

