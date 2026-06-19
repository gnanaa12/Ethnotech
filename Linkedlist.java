package collectios;
import java.util.*;
public class Linkedlist {
    public static void main(String[] args)
    {
    LinkedList<Integer> ll=new LinkedList<>();
    ll.add(201);
    ll.add(202);
    ll.add(203);
    ll.add(204);
        System.out.println(ll);
        ArrayList<Integer> arrl=new ArrayList<>();
        arrl.add(301);
        arrl.add(302);
    ll.addAll(arrl);
    System.out.println(ll);
    }
}
