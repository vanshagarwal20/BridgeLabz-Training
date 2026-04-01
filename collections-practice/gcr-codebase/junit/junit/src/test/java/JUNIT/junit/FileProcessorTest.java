package JUNIT.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessorTest {

    FileProcessor processor = new FileProcessor();
    String fileName = "testFile.txt";

    @Test
    void testWriteAndReadFile() throws IOException {
        processor.writeToFile(fileName, "Hello JUnit");
        String content = processor.readFromFile(fileName);
        assertEquals("Hello JUnit", content);
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        processor.writeToFile(fileName, "Check File");
        assertTrue(Files.exists(Path.of(fileName)));
    }

    @Test
    void testReadFileNotFound() {
        assertThrows(IOException.class, () -> {
            processor.readFromFile("noFile.txt");
        });
    }
}

