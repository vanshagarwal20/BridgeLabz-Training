package java_stream;

import java.io.*;

public class ImageByteArray {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("image.jpg");
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytes;
            while ((bytes = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytes);
            }

            byte[] imageBytes = baos.toByteArray();

            try (FileOutputStream fos = new FileOutputStream("copy.jpg")) {
                fos.write(imageBytes);
            }
            System.out.println("Image copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

