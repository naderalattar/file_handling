package stream;

import java.io.*;

public class bufferedWriter {
    public static void main(String[] args) throws IOException {

        File textualFile=new File("testBufferdWriter.txt");
        FileWriter fr=new FileWriter(textualFile,true);
        BufferedWriter bw=new BufferedWriter(fr);

        bw.newLine();
        bw.write(" 11111.11");


        bw.flush();

    }
}
