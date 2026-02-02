package CSV_data_handling;

import java.io.*;
import java.util.*;

class Student {
    int id, age, marks;
    String name;

    public String toString() {
        return id + " " + name + " " + age + " " + marks;
    }
}

public class CSVtoObject {
    public static void main(String[] args) throws Exception {

        List<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            Student s = new Student();
            s.id = Integer.parseInt(d[0]);
            s.name = d[1];
            s.age = Integer.parseInt(d[2]);
            s.marks = Integer.parseInt(d[3]);
            list.add(s);
        }

        list.forEach(System.out::println);
        br.close();
    }
}
