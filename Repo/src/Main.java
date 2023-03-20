import java.awt.Desktop;
import java.net.URI;

public class Main {
    public static void main(String[] args) throws Exception {
        
        for(int i = 0; i<args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
        // Opens the specific URL in the browser 

        // String url = "https://www.youtube.com";
    
        // try {
        //     // specify the URL you want to open
        //     URI uri = new URI(url);

        //     // get the desktop object and check if it's supported
        //     Desktop desktop = Desktop.getDesktop();
        //     if (desktop.isSupported(Desktop.Action.BROWSE)) {
        //         // open the default web browser and visit the URL
        //         desktop.browse(uri);
        //     } else {
        //         System.out.println("Desktop browsing is not supported.");
        //     }
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

    }
}
