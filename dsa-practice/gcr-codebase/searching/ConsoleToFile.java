package searching;

import java.io.*;

public class ConsoleToFile {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        System.out.println("Enter text (type 'exit' to stop):");
        String input;
        while (!(input = console.readLine()).equalsIgnoreCase("exit")) {
            writer.write(input);
            writer.newLine();
        }

        writer.close();
        System.out.println("Data saved to output.txt");
    }
}

