class NewThread implements Runnable

{

    String name;

    Thread t;

    NewThread(String tmp)

    {

        name = tmp;

        t = new Thread(this, name);

        System.out.println("New Thread: " + t);

        t.start();

    }

    public void run()

    {

        try

        {

            for (int i = 5; i > 0; i--)

            {

                System.out.println(name + " : " + i);

                Thread.sleep(1000);

            }

        }

        catch (InterruptedException e)

        {

            System.out.println(name + " Interrupted.");

        }

        System.out.println(name + " Exiting.");

    }

}

public class multipleThread {
    public static void main(String args[])

    {

        new NewThread("One");

        new NewThread("Two");

        new NewThread("Three");

        try

        {

            Thread.sleep(10000);

        }

        catch (InterruptedException e)

        {

            System.out.println("Main Interrupted.");

        }

        System.out.println("Exiting Main.");

    }
}
