package LoopExcercises;

import java.util.Scanner;

public class Loop6 {
    public static void main (String[] args){
        //13.Write a program to print out all Armstrong numbers between 1 and 500.
        // If sum of cubes of each digit of the number is equal to the number itself,
        // then the number is called an Armstrong number.
        //For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
//A positive number is called armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
/*
        153 = (1*1*1)+(5*5*5)+(3*3*3)
        where:
        (1*1*1)=1
        (5*5*5)=125
        (3*3*3)=27
        So:
        1+125+27=153
*/

        int numberFistDigit;
        int numberSecondDigit;
        int numberThirdDigit;

       for(int i = 1;i<=500; i++){
           int temp = i;
           numberFistDigit= i%10;

           temp= temp/10;
           numberSecondDigit= temp%10;

           temp = temp /10;
           numberThirdDigit = temp %10;

           if(numberFistDigit*numberFistDigit*numberFistDigit + numberSecondDigit*numberSecondDigit*numberSecondDigit +
                   numberThirdDigit*numberThirdDigit*numberThirdDigit == i){
               System.out.println(i);
           }

        }



    }
}
