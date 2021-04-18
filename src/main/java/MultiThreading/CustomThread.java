package MultiThreading;

public class CustomThread implements Runnable{
    Thread customThread;
    private String customName;

    CustomThread(String name) {
        customName = name;
    }

    @Override
    public void run() {
        System.out.println("Thread Running" + " -> " + customName);
        int i = 0;
        while (4 >= i++) {
            System.out.println(i + ": " + customName);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public void start() {
        if (customThread == null) {
            customThread = new Thread(this, customName);
            customThread.start();
        }
    }
}
