package LoopExcercises;

import java.util.Scanner;

public class Loop9_Sin_Cos {
    public static void main(String[] args) {
//19.Write a program to compute sinx for given x. The user should supply x and a positive integer n.
// We compute the sine of x using the series and the computation should
// use all terms in the series up through the term involving xn
//sin x = x - x3/3! + x5/5! - x7/7! +
        Scanner sc = new Scanner(System.in);

        int i, j, n, fact, sign = -1;
        float x, p, sum = 0;
        System.out.println("Enter the value of x : ");
        x = sc.nextFloat();
        System.out.println("Enter the value of n : ");
        n = sc.nextInt();

        for (i = 1; i <= n; i += 2) {
            p = 1;
            fact = 1;
            for (j = 1; j <= i; j++) {
                p = p * x;
                fact = fact * j;
            }
            sign = -1 * sign;
            sum += sign * p / fact;
        }
        System.out.println("sin " + x + " = " + sum);

    }

    }



