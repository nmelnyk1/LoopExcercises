package LoopExcercises;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        //8. Write a program to calculate HCF of Two given number.
        // HFC Highest Common Factor is the greatest common divisor between two or more given numbers.

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2");
        int num2 = sc.nextInt();

        int result;

        for (int i = 1; i <= num1 || i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                result = i;
                System.out.println("HFC of given tro numbers is " + result);
            }
        }
    }}
*/
// 9. Write a do-while loop that asks the user to enter two numbers.
// The numbers should be added and the sum displayed.
// The loop should ask the user whether he or she wishes to perform the operation again.
// If so, the loop should repeat; otherwise it should terminate.
        Scanner sc = new Scanner(System.in);

        char message;

        do {
            System.out.println("Please enter the first  number");
            int num = sc.nextInt();

            System.out.println("Please enter a second number");
            int num2 = sc.nextInt();

            int sum = num + num2;
            System.out.println(sum);

            System.out.println("Do you want to continue?");
            message = sc.next().charAt(0);
        } while (message == 'y'|| message == 'Y');
    }

    }