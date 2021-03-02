package LoopExcercises;

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        // 10.Write a program to enter the numbers till the user
        // wants and at the end it should display the count of positive, negative and zeros entered.
        Scanner sc = new Scanner(System.in);

     /*   int num;
        int positiveNum = 0;
        int negativeNum = 0;
        int zeroCount =0;

        char choice;

        do{
            System.out.println("Enter number");
            num = sc.nextInt();

            if(num>0){
                positiveNum++;
            }else if(num<0){
                negativeNum++;
            }else {
                zeroCount++;
            }
            System.out.println("Do you want to continue?");
            choice= sc.next().charAt(0);
        }while( choice =='y' || choice == 'Y');
            System.out.println("POsitive numbers: " + positiveNum);
            System.out.println("Negative numbers: " + negativeNum);
            System.out.println("Zero numbers:" + zeroCount);
        }*/


        //12.Write a program to enter the numbers till the user
        // wants and at the end the program should display the largest and smallest numbers entered.

        int num;
        int num1 = Integer.MAX_VALUE;
        int num2 = Integer.MIN_VALUE;

        char choice;

        do {
            System.out.println("Enter a number");
            num = sc.nextInt();
            if (num > num1) {
                num1 = num;
            }
            if (num < num2) {
                num2 = num;
            }
            System.out.println("Would you like to continue?");
            choice = sc.next().charAt(0);
        }while (choice == 'y' || choice == 'Y') ;
                    System.out.println("Maximum value of a number is " + num1);
                    System.out.println("Minimum value of the number is " + num2);
                }

            }








