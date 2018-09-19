package uz.coder.linkgenerator;

import java.io.*;

public class FileWrite {
    public void writeData(String data) throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File("output.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            Writer writer = new FileWriter(file);
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter!=null) bufferedWriter.close();
        }
    }
}
