import cr.una.multithread.ExtendExample;
import cr.una.multithread.ImplementExample;

public class ThreadMainExample {

    static void TestExtendExample() {
        ExtendExample extendExample1 = new ExtendExample("T1");
        ExtendExample extendExample2 = new ExtendExample("T2");
        ExtendExample extendExample3 = new ExtendExample("T3");
        ExtendExample extendExample4 = new ExtendExample("T4");

        extendExample1.start();
        extendExample2.start();
        extendExample3.start();
        extendExample4.start();
    }

    static void TestImplementExample() {
        Thread implementExample1 = new Thread(new ImplementExample("T1"));
        Thread implementExample2 = new Thread(new ImplementExample("T2"));
        Thread implementExample3 = new Thread(new ImplementExample("T3"));
        Thread implementExample4 = new Thread(new ImplementExample("T4"));

        implementExample1.start();
        implementExample2.start();
        implementExample3.start();
        implementExample4.start();
    }

    // Main Class
    public static void main(String[] args)
    {
        TestExtendExample ();
        TestImplementExample();
    }
}
