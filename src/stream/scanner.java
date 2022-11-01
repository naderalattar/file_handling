package stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner=new Scanner(new File("verbs.txt"));

        // بحدد متى يتوقف الscanner عن القراءه
        // بختار الحد اللى بيوقف عنده الكيرسور
        scanner.useDelimiter("\\D+");
//        while (scanner.hasNextLine()){
            System.out.println(scanner.next());
            System.out.println(scanner.next());
//        }
    }
}
