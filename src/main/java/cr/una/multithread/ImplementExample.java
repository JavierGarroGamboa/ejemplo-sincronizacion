package cr.una.multithread;

public class ImplementExample implements Runnable {
    public String name;

    public ImplementExample(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(getName());
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
        System.out.println ("El hilo Implement con el NOMBRE [ " +
                Thread.currentThread().getName() + " ] y con el ID [ " + Thread.currentThread().getId() +
                " ] esta corriendo");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
