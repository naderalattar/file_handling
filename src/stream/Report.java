package stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Report {
        public static void main(String[] args) throws IOException {
                studentt student1=new studentt("nader",111111111);
                studentt student2=new studentt("mohamed",222222222);

                File studentFile=new File("student.txt");
                if(!studentFile.exists()){
                      studentFile.createNewFile();
                }

                FileWriter fileWriter=new FileWriter(studentFile ,true);
                BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);


                bufferedWriter.write("student 1 : "+ student1.name+"  "+String.valueOf(student1.id));
                bufferedWriter.newLine();
                bufferedWriter.write("student 2 : "+ student2.name+"  "+String.valueOf(student2.id));
                bufferedWriter.newLine();
                bufferedWriter.flush();
        }








}
class student {
        String name;
        int id;

        public student(String name, int id) {
                this.name = name;
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }
}
