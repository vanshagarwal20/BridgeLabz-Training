package searching;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ByteToChar {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        sc.close();
    }
}

