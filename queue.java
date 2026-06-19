package collectios;
import java.util.*;
public class queue {
public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();//low number has highest priority
    PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
    //Comparator.reverseOrder() this makes priority changes larger nums have high priority
    pq.add(1);
    pq.add(3);
    pq.offer(2);
    pq.offer(4);
    pq.offer(5);
    //both add and offer are same methods(function)
    System.out.println(pq);
    System.out.println(pq.peek());//gives the head element
    System.out.println(pq.peek());//same number as printed by above statement
    //if queue is empty then peek value is null as queue is implemented using arrays
    System.out.println(pq.poll());
    //return head and poll() removes the head value from the queue
    // in updated queue head must be the highest priority one other elements may changes
    System.out.println(pq);
    System.out.println(pq.peek());
    System.out.println(pq.remove());//same as poll but it gives exception when queue is empty which is not in poll(returns null in poll)
    System.out.println(pq.contains(5));//just verifies return true or false
    System.out.println(pq.isEmpty());
    System.out.println(pq.contains(100));
    pq.offer(6);
    pq.offer(7);
    pq.offer(7);

    //iteration
    for (Integer i : pq) {
        System.out.print(i + " ");
    }
//should not use for loop to retrive the elements because priority order does not follow
    System.out.println();
    while (!pq.isEmpty()) {
        System.out.print(pq.poll() + " ");
    }


    ArrayDeque<String> ad = new ArrayDeque<>();
  /*
  insertion,deletion and retrival can be done at both ends
  Addition - offer,offerFirst,offerLast,addFirst,addLast,add,offer
  deletion - peekFirst,peekLast,peek
  retrival= pollFirst,pollLast,poll
  mainrains insertion order
  default capacity and initial  =11
  doesnot allow to add null values
  allows duplicate values
  insertion and sorted no maintaind
  no random access
  not synchronised



   */
    ad.add("apple");
    ad.addFirst("mango");
    ad.addLast("muskmelon");

    System.out.println(ad);
    System.out.println(ad.peek());
    System.out.println(ad.size());
    System.out.println(ad.isEmpty());



}
}
