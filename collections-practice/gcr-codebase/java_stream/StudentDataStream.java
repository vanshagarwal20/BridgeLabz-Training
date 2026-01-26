package java_stream;

import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.dat"))) {
            dos.writeInt(101);
            dos.writeUTF("Vansh");
            dos.writeDouble(8.9);
        } catch (IOException e) { e.printStackTrace(); }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("student.dat"))) {
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readDouble());
        } catch (IOException e) { e.printStackTrace(); }
    }
}

