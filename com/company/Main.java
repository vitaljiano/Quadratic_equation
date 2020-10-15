package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть по черзі а, б, с");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Quadratic quadratic= new Quadratic(a,b,c);
        quadratic.resultX();
    }
}
