package MultiThreading;

public class MultiThreadPractice implements Runnable
{
    public static void main(String[] args) {
        runThreadNames();
        runThreadSleeping();
        runCustomThread();
    }
    @Override
    public void run() {
    }

    private static void runThreadNames() {
        System.out.println("--- Run Thread Names ---");

        Thread guruThread1 = new Thread("Guru1");
        Thread guruThread2 = new Thread("Guru2");
        guruThread1.start();
        guruThread2.start();

        System.out.println(guruThread1.getName());
        System.out.println(guruThread2.getName());
    }

    private static void runThreadSleeping() {
        System.out.println("\n--- Run Thread Sleeping ---");

        Thread guruThread1 = new Thread("guru1");
        guruThread1.start();
        try {
            guruThread1.sleep(999);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        guruThread1.setPriority(1);
        int guruPriority = guruThread1.getPriority();
        System.out.println(guruPriority);
        System.out.println("Thread running");
    }

    private static void runCustomThread() {
        System.out.println("\n--- Run Custom Thread ---");

        CustomThread customThread1 = new CustomThread("custom 1");
        customThread1.start();
        CustomThread customeThread2 = new CustomThread("custom 2");
        customeThread2.start();
    }

}
