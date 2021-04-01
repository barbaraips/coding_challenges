package com.company;

import java.util.Scanner;

public class TripleTrouble {

    public static void main(String[] args) {
        String a;
        String b;

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Enter the first number: ");
            a = scan.nextLine();

            System.out.println("Enter the second number: ");
            b = scan.nextLine();
        }

        System.out.println(tripleDouble(a, b));
    }

    static int tripleDouble(String a, String b) {

        for (String item : a.split("")) {
            int triple = Integer.valueOf(item) * 3;
            int doubl = Integer.valueOf(item) * 2;

            if (a.contains(String.valueOf(triple))) {
                if (b.contains(String.valueOf(doubl))) return 1;
            } else return 0;
        }
        return 0;
    }
}
