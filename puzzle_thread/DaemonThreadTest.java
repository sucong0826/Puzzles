package puzzle_thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by SuCong on 2015/09/17.
 */
public class DaemonThreadTest {
    public static void main(String[] args) throws InterruptedException {
//        Runnable runnable = new DaemonRunnable();
//        Thread thread = new Thread(runnable);
//        thread.setDaemon(true);
//        thread.start();

        Thread thread1 = new MyCommonThread();
        Thread thread2 = new Thread(new MyDaemonRunnable());

        thread2.setDaemon(true);
        thread2.start();
        thread1.start();
    }

    private static class MyCommonThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("后台线程第" + i + "次执行");
                try {
                    Thread.sleep(7);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }
    }
}

class DaemonRunnable implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            File file = new File("daemon.txt");
            FileOutputStream fileOs = new FileOutputStream(file, true);
            fileOs.write("daemon".getBytes());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

class MyDaemonRunnable implements Runnable {

    @Override
    public void run() {
        for (long i = 0; i < 9999999L; i++) {
            System.out.println("后台守护线程第" + i + "次执行");
            try {
                Thread.sleep(7);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}


