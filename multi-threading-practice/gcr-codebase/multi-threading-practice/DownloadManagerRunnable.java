package multi_threading_practice;

import java.util.Random;

class FileDownloaderRunnable implements Runnable {
    private String fileName;
    private Random random = new Random();

    public FileDownloaderRunnable(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        for (int progress = 0; progress <= 100; progress += 25) {
            try {
                Thread.sleep(random.nextInt(500) + 200); // random delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("[" + Thread.currentThread().getName() + 
                "] Downloading " + fileName + ": " + progress + "%");
        }
    }
}

public class DownloadManagerRunnable {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new FileDownloaderRunnable("Document.pdf"));
        Thread t2 = new Thread(new FileDownloaderRunnable("Image.jpg"));
        Thread t3 = new Thread(new FileDownloaderRunnable("Video.mp4"));

        t1.start();
        t2.start();
        t3.start();

        // Main thread waits
        t1.join();
        t2.join();
        t3.join();

        System.out.println("All downloads complete!");
    }
}

