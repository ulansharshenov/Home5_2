package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int count = 1;
        int summa = 0;

        while (count <= num){
            summa += count;
            count++;
        }
        System.out.println(summa);
    }
}
