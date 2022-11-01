package stream;

import java.io.*;

public class fileOutputStram {
    public static void main(String[] args) throws IOException {

        File f=new File("C:\\Users\\laptop\\Desktop\\Annotation.png");
        FileInputStream fis=new FileInputStream(f);
        //read half of the image
        byte[] bytes=new byte[(int) f.length()/2];
        fis.read(bytes);

        for(byte b:bytes){
            System.out.print(b);
        }

        //write half of the image
        FileOutputStream fos=new FileOutputStream("createdImage2.jpg");
        fos.write(bytes);

        fis.close();
        fos.close();


        System.out.println("all is done");


    }
}
