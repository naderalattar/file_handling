package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileInputStream {
    public static void main(String[] args) throws IOException {

        File f=new File("name.txt");
        FileInputStream fis=new FileInputStream(f);
        byte[] chars=new byte[(int) f.length()];
        fis.read(chars);
        for (byte b:chars) {
            System.out.print((char)b);
        }

    }
}
