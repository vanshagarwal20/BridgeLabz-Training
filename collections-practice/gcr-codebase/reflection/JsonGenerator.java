package reflection;

import java.lang.reflect.*;

class Employee {
    String name = "Rahul";
    int salary = 50000;
}

public class JsonGenerator {
    public static void main(String[] args) throws Exception {

        Employee emp = new Employee();
        StringBuilder json = new StringBuilder("{");

        for (Field f : emp.getClass().getDeclaredFields()) {
            f.setAccessible(true);
            json.append("\"").append(f.getName()).append("\":\"")
                .append(f.get(emp)).append("\",");
        }

        json.deleteCharAt(json.length() - 1);
        json.append("}");

        System.out.println(json);
    }
}

