package day4;
import java.lang.*;
public class msgsender extends Thread {
    msgsender()
    {

    }
    public void run()
    {
        try
        {
            for(int i=0;i<3;i++)
            {
                System.out.println("Msg is sent");
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class msgapp
{
    public static void main(String[] args) throws InterruptedException {
        msgsender gnana=new msgsender();
        msgsender prasuna=new msgsender();
       System.out.println(gnana.getState());

        gnana.start();
        prasuna.start();
        gnana.isAlive();
        prasuna.isAlive();
        gnana.join();
        prasuna.join(); //join is used to make thread wait
        // prasuna.start();
        //System.out.println(gnana.getState());
    }
}