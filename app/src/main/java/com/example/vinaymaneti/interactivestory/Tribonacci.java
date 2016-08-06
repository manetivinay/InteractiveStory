package com.example.vinaymaneti.interactivestory;

import java.util.Scanner;

/**
 * Created by vinaymaneti on 8/2/16.
 */
public class Tribonacci {
    public static void main(String args[]) {
        Scanner mScanner = new Scanner(System.in);
        System.out.println("Enter the number till you want Tribonaccio series :");
        int n = mScanner.nextInt();

        int a = 0, b = 0, c = 1;
        int d = a + b + c;

        System.out.println("Tribonaocci series");
        System.out.print(a + "\t" + b + "\t" + c);

        for (int i = 4; i <= n; i++) {
            System.out.print("\t" + d);
            a = b;
            b = c;
            c = d;
            d = a + b + c;
        }
        System.out.println();
    }
}
