package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the word:");
        String word = scan.nextLine();

        if (word.length() > 2) {
            System.out.printf("Result: %s%n", word.substring(1, word.length() - 1));
        } else {
            System.out.println("Invalid word.");
        }

    }
}
