import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Automate {
    public static void main(String[] args) throws IOException, URISyntaxException {
    
        String url = "https://www.google.com/search?q=";
        String validWebsites[] = {"stackoverflow.com", "reddit.com", "geekforgeeks.com"};

        String testQuerry = System.console().readLine();

        String testArray[] = testQuerry.split(" ");
        // Copies the array of strings from the terminal
        String query[] = new String[testArray.length];

        for (int i = 0; i < testArray.length; i++) {
            query[i] = testArray[i];
        }

        if (query.length == 0) {
            System.out.print("Error: Please enter a proper search query, Romy.");
            System.out.print("URL: " + query);
        } 
        else {
            StringBuffer sb = new StringBuffer();

            for(int i = 0; i < query.length; i++) {
                sb.append(query[i] + "+");
            }

            // Converts that array into a single string 
            String fixedQuery = sb.toString();

            url = url.concat(fixedQuery);
            url = url.concat(filteredQuery(validWebsites));

            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    // Method that returns the filtered websites the program will only search
    static String filteredQuery(String validWebsites[]) { 
        String filter = "(";
        int index = 0;
        for (String website : validWebsites) {
            filter = filter + "site:" + website;
            index++;
            if (index == validWebsites.length) {
                filter = filter + ")";
            }
            else {
                filter = filter + "+OR+";
            }
            
        }
        
        return filter;
    }
}
