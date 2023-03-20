import java.awt.Desktop;
import java.net.URI;

public class Main {
    public static void main(String[] args) throws Exception {

        // Open default browser with given URL
        String url = "https://www.google.com/search?q=";
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(URI.create(url));

        // Creates an array that copies all of the elements of the args
        String[] finalQuery = new String[args.length];

        finalQuery = args;

        String query = String.join(" ", finalQuery);

        url = url.concat(query);
        System.out.print(url);

        // Valid websites that only the code will filter the search
        String[] validWebsites = {  "stackoverflow.com", 
                                    "reddit.com", 
                                    "stackexchange.com", 
                                    "geeksforgeeks.com"};

    }
}
