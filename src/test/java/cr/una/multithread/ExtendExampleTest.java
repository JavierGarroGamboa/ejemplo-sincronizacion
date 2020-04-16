package cr.una.multithread;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ExtendExampleTest {
    ExtendExample extendExample = new ExtendExample("T1");

    @Test
    public void create_start_finish() {
        try {
            // In the above program, one thread will be created i.e. the main thread which
            // is responsible to execute the main() method and the child thread will be
            // created after the execution of t.start() which is responsible to execute
            // run() method.
            assertEquals(Thread.State.NEW, extendExample.getState());
            assertEquals(Thread.State.NEW, extendExample.getState());

            extendExample.start();

            assertEquals(Thread.State.RUNNABLE, extendExample.getState());

            extendExample.join();

            assertEquals(Thread.State.TERMINATED, extendExample.getState());
        } catch (InterruptedException e) {
            // Throwing an exception
            System.out.println ("Hubo una Excepción " + Arrays.toString(e.getStackTrace()));

        }
    }

    @Test(expected = IllegalThreadStateException.class)
    public void throw_exception_start_twice() {
        extendExample.start();
        extendExample.start();
    }
}
