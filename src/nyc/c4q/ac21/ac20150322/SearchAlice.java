package nyc.c4q.ac21.ac20150322;

/**
 * Access Code 2.1
 * Ramona Harrison
 * SearchAlice.java
 */

    import nyc.c4q.ac21.ac20150322.HTTP;

    import java.util.Scanner;
    import java.net.URL;

    public class SearchAlice {
        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter the URL: ");
//        String input = sc.next();
//        System.out.print("Please enter a word that you want to search: ");
//        String aWord = sc.next();
//        URL url = HTTP.stringToURL(input);
            URL newUrl = HTTP.stringToURL("http://www.alexsamuel.net/AliceInWonderland.txt");
            String document = HTTP.get(newUrl);
            document = document.toLowerCase();
            System.out.println(count(document, "alice"));

        }

        public static int count(String document, String aNewWord) {

            int i = 0;
            int count = 0;
            while (true) {
                i = document.indexOf(aNewWord, i);
                if (i == -1)
                    break;
                i += aNewWord.length();
                count++;
            }
            return count;
        }
    }




