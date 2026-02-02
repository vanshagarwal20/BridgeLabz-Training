package CSV_data_handling;

import java.io.*;

public class WriteCSV {
    public static void main(String[] args) throws Exception {

        BufferedWriter bw = new BufferedWriter(new FileWriter("employees.csv"));

        bw.write("ID,Name,Department,Salary\n");
        bw.write("1,Aman,IT,50000\n");
        bw.write("2,Rahul,HR,40000\n");
        bw.write("3,Vansh,IT,60000\n");
        bw.write("4,Neha,Finance,55000\n");
        bw.write("5,Riya,IT,65000\n");

        bw.close();
    }
}

