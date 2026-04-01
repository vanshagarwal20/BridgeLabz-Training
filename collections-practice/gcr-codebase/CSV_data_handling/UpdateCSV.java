package CSV_data_handling;

import java.io.*;

public class UpdateCSV {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("updated.csv"));

        String line = br.readLine();
        bw.write(line + "\n");

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            if (d[2].equals("IT")) {
                double salary = Double.parseDouble(d[3]) * 1.10;
                d[3] = String.valueOf(salary);
            }
            bw.write(String.join(",", d) + "\n");
        }

        br.close();
        bw.close();
    }
}

