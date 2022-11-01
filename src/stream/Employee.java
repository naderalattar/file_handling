package stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) throws IOException {
        File emplyee=new File("employee.txt");
        Scanner scanner=new Scanner(emplyee);
        while (scanner.hasNextLine()){
            String line=scanner.nextLine();
            printEmployee(line);
        }


    }

    private static void printEmployee(String line) {
        String name;
        String job;
        int tel;
        Scanner scanner=new Scanner(line);
        scanner.useDelimiter(":");
        while (scanner.hasNext()){
            name=scanner.next();
            job=scanner.next();
            tel=Integer.valueOf(scanner.next().trim());
            System.out.println("name : "+name+" job : "+job+" tel : "+tel);

        }
    }
}
