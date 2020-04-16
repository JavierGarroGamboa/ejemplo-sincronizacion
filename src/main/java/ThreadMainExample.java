import cr.una.multithread.ExtendExample;
import cr.una.multithread.ExtendExampleSync;
import cr.una.multithread.PrintDemo;

public class ThreadMainExample {

    private static void NoSync() {
        PrintDemo PD = new PrintDemo();

        ExtendExample T1 = new ExtendExample( "Thread - 1 ", PD );
        ExtendExample T2 = new ExtendExample( "Thread - 2 ", PD );

        T1.start();
        T2.start();

        // wait for threads to end
        try {
            T1.join();
            T2.join();
        }catch( Exception e) {
            System.out.println("Interrupted");
        }
    }

    private static void Sync() {
        PrintDemo PD = new PrintDemo();

        ExtendExampleSync T1 = new ExtendExampleSync( "Thread - 1 ", PD );
        ExtendExampleSync T2 = new ExtendExampleSync( "Thread - 2 ", PD );

        T1.start();
        T2.start();

        // wait for threads to end
        try {
            T1.join();
            T2.join();
        }catch( Exception e) {
            System.out.println("Interrupted");
        }
    }

    // Main Class
    public static void main(String[] args)
    {
        NoSync();
        Sync();
    }
}
