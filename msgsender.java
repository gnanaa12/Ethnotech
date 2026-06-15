package day4;
import java.lang.*;
public class msgsender extends Thread {
    
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
        System.out.println(gnana.getState());
        System.out.println(gnana.isAlive());
        System.out.println(prasuna.isAlive());
        gnana.join();
        System.out.println(gnana.getState());
        prasuna.join();
    }
}