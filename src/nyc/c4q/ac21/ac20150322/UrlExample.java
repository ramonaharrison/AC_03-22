package nyc.c4q.ac21.ac20150322;

/**
 * Access Code 2.1
 * Ramona Harrison
 * UrlExample.java
 */

import java.net.URL;

public class UrlExample {
    public static void main(String[] args) {
        URL google = makeHttpUrl("google.com", 80, "/search");
        printURL(google);
        System.out.println(google);
    }

    public static URL makeHttpUrl (String host, int port, String path) {
        if (port == 80)
            return HTTP.stringToURL("http://" + host + path);
        return HTTP.stringToURL("http://" + host + ":" + port + path);
    }

    public static URL makeHttpUrl (String host, String path) {
        return makeHttpUrl(host, 80, path);

    }

    public static void printURL (URL url) {
        String host = url.getHost();
        int port = url.getPort();
        String path = url.getPath();

        if (port == -1)
            port = 80;

        System.out.println("URL:\n" + "\nHost: " + host + "\nPort: " + port + "\nPath: " + path);

    }
}
