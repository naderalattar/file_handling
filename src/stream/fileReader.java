package stream;

import java.io.*;

public class fileReader {
    public static void main(String[] args) throws IOException {

        File verbs=new File("verbs.txt");
        Reader reader=new FileReader(verbs);

        char[] buffer=new char[(int) verbs.length()];

        reader.read(buffer);


        for (char c:buffer){

            System.out.print(c);

        }
    }
}
