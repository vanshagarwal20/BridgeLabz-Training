package java_stream;

import java.io.*;

public class BufferedVsUnbuffered {

    static void copy(InputStream is, OutputStream os) throws IOException {
        byte[] buffer = new byte[4096];
        int bytes;
        while ((bytes = is.read(buffer)) != -1) {
            os.write(buffer, 0, bytes);
        }
        os.flush();
    }

    public static void main(String[] args) throws Exception {
        long start, end;

//         Unbuffered
        start = System.nanoTime();
        copy(new FileInputStream("bigfile.dat"),
             new FileOutputStream("normal.dat"));
        end = System.nanoTime();
        System.out.println("Unbuffered Time: " + (end - start));

//         Buffered
        start = System.nanoTime();
        copy(new BufferedInputStream(new FileInputStream("bigfile.dat")),
             new BufferedOutputStream(new FileOutputStream("buffered.dat")));
        end = System.nanoTime();
        System.out.println("Buffered Time: " + (end - start));
    }
}

