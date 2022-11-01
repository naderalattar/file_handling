package stream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class fileWriter {
    public static void main(String[] args) throws IOException, InterruptedException {
        File xl=new File("testBufferdWriter.txt");
        Writer writer=new FileWriter(xl);
        writer.write("nader alattar");
        writer.flush();
        writer.close();

        Thread.sleep(5000);

//        Files.delete(Path.of("grads.xlsx"));

    }
}
