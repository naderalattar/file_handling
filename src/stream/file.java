package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

public class file {
    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {

                                             // creation of a directory
//        File f=new File("images");
//        System.out.println(f.exists());
//        f.mkdir();
//        String [] d=f.list();
//        for (int i = 0; i <d.length ; i++) {
//            System.out.println(d[i]);
//
//        }



        // copy video from location to anther location

        File video=new File("java.mp4");
        FileInputStream fis=new FileInputStream(video);
        byte[] buffer=new byte[(int) video.length()];

        fis.read(buffer);
        fis.close();

        Files.delete(Path.of("java.mp4"));


        File newVideo=new File("videos","movie.mp4");
        newVideo.createNewFile();
        FileOutputStream fos=new FileOutputStream(newVideo);

        fos.write(buffer);

        Thread.sleep(4000);

        newVideo.delete();


    }
}
