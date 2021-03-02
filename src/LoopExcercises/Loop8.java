package LoopExcercises;

import java.util.Scanner;

public class Loop8 {
    public static void main(String[] args) {
//17.Write a program that generates a random number and asks the user to guess what the number is.
// If the user's guess is higher than the random number, the program should display "Too high, try again."
// If the user's guess is lower than the random number,
// the program should display "Too low, try again."
// The program should use a loop that repeats until the user correctly guesses the random number.

        Scanner sc = new Scanner(System.in);

        int randomNumber;
        int userNumber;
        int numberTry=0;
        randomNumber = (int)(Math.random() * 100) +1; // random number between 1 and 100

       do {

           System.out.println("Enter a number between 1 and 100");
           userNumber = sc.nextInt();
           numberTry++;
           if (userNumber > randomNumber) {
               System.out.println("Too high! try Again");
           } else if (userNumber < randomNumber) {
               System.out.println("Too low! Try again");
           } else {
               System.out.println("Correct! You got it in " + numberTry + " guesses");
           }
       }while(numberTry!=randomNumber);

    }
}
