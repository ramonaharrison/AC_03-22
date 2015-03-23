package nyc.c4q.ac21.ac20150322;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Ascii.java
 */
public class Ascii {
    public static void main(String[] args) {


        /*String greeting = "Hello, world!";

        for (int i = 0; i < greeting.length(); i++) {
            char c = greeting.charAt(i);

            int code = (int) c;

        } */

        System.out.println(isUppercase('a'));
        System.out.println(isUppercase('A'));


    }

    public static void casts() {

        double pi = 3.14159;
        int mostOfPi = (int) pi;

        int x = 42;
        double y = x;

    }
    public static boolean isUppercase (char c) {
        return c >= 65 && c <= 90;
    }
}
