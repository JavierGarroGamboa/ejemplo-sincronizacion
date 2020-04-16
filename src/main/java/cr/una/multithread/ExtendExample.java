package cr.una.multithread;

public class ExtendExample extends Thread {

    public ExtendExample(String name) {
        super(name);
    }

    public void run()
    {
        try
        {
            printData();
        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Hubo una Excepción");
        }
    }

    private synchronized void printData() {
        // Displaying the thread that is running
        System.out.println ("El hilo Extend con el NOMBRE [ " +
                getName() + " ] y con el ID [ " + Thread.currentThread().getId() +
                " ] esta corriendo");
    }
}
