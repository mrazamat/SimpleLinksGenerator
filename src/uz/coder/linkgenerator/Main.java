package uz.coder.linkgenerator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Config cfg = new Config();
        String str = cfg.getPropValues();
        int count = Integer.parseInt(str.substring(0, 2));
        String url = str.substring(2);
        url=url.trim();



        for (int i = 1; i < count; i++) {
            System.out.println("<p>" +
                    "<a href=\""  + url + i +".jpg\" data-fancybox=\"gallery\">" +
                    "<img class=\"img-fluid\" src=\"" + url + i +".jpg\"/>" +
                    "</a>" +
                    "</p>\n");
        }
    }
}
