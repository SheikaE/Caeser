package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // prompt user for a number
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input: ");
        Integer input = keyboard.nextInt();


        //  loop until you get a number between 1 and 25
        if (input <= 25) {
            System.out.println("Rotation: " + input);
            System.out.println("Success");
            System.out.println(input);
            System.out.println("plaintext: ");
            String plaintext = keyboard.nextLine();
        } else {
            System.out.println("Rotation: " + input);
            System.out.println("Too High");
            System.out.println("Rotation: ");
        }

        // prompt user for plain text
        // iterate over each character for the plaintext
        String text;
        do {
            text = keyboard.nextLine();
        } while (text.equals(""));
        int textlength = text.length();
        char letters[] = new char[textlength];
        for (int i = 0; i < textlength; i++) {
            letters[i] = text.charAt(i);

        }
        String message = encode(text);
        System.out.println(message);

    }
    // ***8ERROR IN LINE 47****
    static String encode(String ciphertext)
    {
        String message = "";
        for (int i = 0; i < ciphertext.length(); i++) {
            message = ciphertext.charAt(i);
        }
        return message;

            // if it is an uppercase letter, rotate it, preserving case, then print out rotated character

            // if it is a lowercase letter, rotate it, preserving case, then print out rotated character

            // if it is neither, print out the character as is

            // print a new line

    }
}