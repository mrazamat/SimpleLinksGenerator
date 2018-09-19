package uz.coder.linkgenerator;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Config cfg = new Config();
        String str = cfg.getPropValues();
        int count = Integer.parseInt(str.substring(0, 2));
        String url = str.substring(2);
        url=url.trim();


        String text = "";

        for (int i = 1; i <= count; i++) {
            text+=("<p>" +
                    "<a href=\""  + url + i +".jpg\" data-fancybox=\"gallery\">" +
                    "<img class=\"img-fluid\" src=\"" + url + i +".jpg\"/>" +
                    "</a>" +
                    "</p>\n");
        }
        FileWrite write = new FileWrite();
        write.writeData(text);
    }
}
