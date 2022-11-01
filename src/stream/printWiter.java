package stream;

import java.io.*;

public class printWiter {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter=new PrintWriter(new FileOutputStream(new File("printWriter.txt")));
        printWriter.println(33);
        printWriter.flush();
    }
}
