package LoopExcercises;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        //5. Write a program that prompts the user to input
        // an integer and then outputs the number with the digits reversed.
        // For example, if the input is 12345, the output should be 54321.

       /* Scanner sc = new Scanner(System.in);

        int num1;
        System.out.println("Enter a number");
        num1 = sc.nextInt();

        int reversedNum = 0;
        for(int i = 0; num1>0; i++){
            reversedNum *=10;
            reversedNum = reversedNum + num1%10;
            num1/=10;

        }
        System.out.println("Reversed number is " + reversedNum);*/

        //6.Write a program that reads a set of integers,
        // and then prints the sum of the even and odd integers.

  /*      Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int num1 = sc.nextInt();

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i < num1; i++) {

            if (num1 % 2 == 0) {
                sumEven += i;
                System.out.println(num1 + " is even");
            } else {
                sumOdd += i;
                System.out.println(num1 + " is odd");
            }

        }
        System.out.println("Sum of odd is " + sumOdd);
        System.out.println("Sum of even is " + sumEven);*/

        //7. Write a program that prompts the user to input a positive integer.
        // It should then output a message indicating whether the number is a prime number.
        // prime number is greater than 1 and divided by 1 or itself only. 0 and 1 are not prime
    /*    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(isPrime(num)) {
            System.out.println("The number is prime");
        }else {
            System.out.println("The number is not prime");

            }
        }


    // method
public static boolean isPrime (int num){
    if(num<=1){
        return false;
    }
    for ( int i = 2; i<Math.sqrt(num); i++){
        if(num %i==0){
            return false;
        }
    }
    return true;*/
}
}