package stream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File object=new File("object.txt");

        // serialization
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(object));
        studentt s1=new studentt("nader",22);
        studentt s2=new studentt("fares",32);

        List<studentt> stds= List.of(s1,s2);
        objectOutputStream.writeObject(stds);
        objectOutputStream.flush();


        // deserializtion
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(object));


        System.out.println(objectInputStream.readObject());
    }
}

