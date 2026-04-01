package CSV_data_handling;

import java.io.*;

public class FilterCSV {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        String line;
        br.readLine();

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            if (Integer.parseInt(d[3]) > 80)
                System.out.println(line);
        }
        br.close();
    }
}

