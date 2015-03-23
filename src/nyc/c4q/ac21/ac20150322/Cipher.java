package nyc.c4q.ac21.ac20150322;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Cipher.java
 */

import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Would you like to encode or decode:");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("encode")) {
                System.out.println("Enter a sentence to encode:");
                String cipher = sc.nextLine();
                System.out.println("Pick a number:");
                int number = sc.nextInt();
                System.out.println(rot13(cipher, number));
            } else if (choice.equalsIgnoreCase("decode")) {
                System.out.println("Enter a sentence to decode:");
                String cipher = sc.nextLine();
                System.out.println("Pick a number:");
                int number = sc.nextInt();
                //System.out.println(rot13decode(cipher, number));
            }
        }
    }

    public static String rot13(String input, int number) {
        String encodedString = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int code = (int) c;
            if (isFirstHalf(c)) {
                char addToString = (char) (code + number);
                encodedString += addToString;
            } else if (isSecondHalf(c)) {
                char addToString = (char) (code - number);
                encodedString += addToString;
            } else {
                encodedString += c;
            }

        }
        return encodedString;
    }

  /*  public static String rot13decode(String input, int number) {
        if (number == 13) {
            return rot13(input, number);
        } else if (number < 13) {

        } else if (number < 26) {

        } else {
            return "Please enter a number between 0 and 26";
        }
    } */

    public static boolean isFirstHalf (char c) {
        return c >= 65 && c <= 77 || c >= 97 && c <=109;
    }

    public static boolean isSecondHalf (char c) {
        return c >= 78 && c <= 90 || c >= 110 && c <=122;
    }
}
