package com.company;

import java.util.Scanner;

public class Main{ 
    public static void main(String[] args) {
        Scanner a1 = new Scanner(System.in);
        Scanner b1 = new Scanner(System.in);
        Scanner c1 = new Scanner(System.in);
        int a = a1.nextInt();
        int b = b1.nextInt();
        int c = c1.nextInt();
        System.out.println(a + " " + b + " " + c);
        if (a > b && a > c) {
            System.out.println("Максимальное число : " + a);
        } else if (b > a && b > c) {
            System.out.println("Максимальное число : " + b);
        } else if (c > a && c > b) {
            System.out.println("Максимальное число : " + c);
        }

    }
}
