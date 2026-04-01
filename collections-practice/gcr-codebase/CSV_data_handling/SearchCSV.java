package CSV_data_handling;

import java.io.*;

public class SearchCSV {
    public static void main(String[] args) throws Exception {

        String searchName = "Vansh";
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        String line;
        br.readLine();

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            if (d[1].equalsIgnoreCase(searchName)) {
                System.out.println("Dept: " + d[2] + ", Salary: " + d[3]);
            }
        }
        br.close();
    }
}

