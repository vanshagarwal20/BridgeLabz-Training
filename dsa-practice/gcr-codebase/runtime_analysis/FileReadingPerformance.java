package runtime_analysis;

import java.io.*;

public class FileReadingPerformance {

//     FileReader approach
    static void readUsingFileReader(String filePath) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while (reader.readLine() != null) {
            // processing
        }
        reader.close();
    }

//     InputStreamReader approach
    static void readUsingInputStreamReader(String filePath) throws Exception {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath))
        );
        while (reader.readLine() != null) {
//             processing
        }
        reader.close();
    }

    public static void main(String[] args) throws Exception {

        String filePath = "largeFile.txt"; // assume large file exists
        long start, time;

//         FileReader timing
        start = System.nanoTime();
        readUsingFileReader(filePath);
        time = System.nanoTime() - start;
        System.out.println("FileReader Time       : " + time + " ns");

//         InputStreamReader timing
        start = System.nanoTime();
        readUsingInputStreamReader(filePath);
        time = System.nanoTime() - start;
        System.out.println("InputStreamReader Time: " + time + " ns");
    }
}

