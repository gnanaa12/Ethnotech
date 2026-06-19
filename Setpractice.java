package collectios;

import java.util.*;

class SetPractice {
    public static void main(String[] args) {
       // Set<Integer> set = new HashSet<>();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println(set);//prints empty list

        set.add(5);
        set.add(6);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.remove(6);//should specify the value not index
        System.out.println(set.remove(6));//returns true or false
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains(40));

        //cannot update values. if we want to update then remove that value and add new value
   //cannot retrive the elements with index
        for(Integer i:set){
            System.out.println(i);
        }

        System.out.println("TreeSet");

        treeSet.add(350);
        treeSet.add(380);
        treeSet.add(222);
        treeSet.add(476);
        treeSet.add(612);
        treeSet.add(72);
        System.out.println(treeSet);
        System.out.println(treeSet.size());
        System.out.println(treeSet.isEmpty());
        System.out.println(treeSet.contains(350));
        System.out.println(treeSet.contains(300));
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());
        System.out.println(treeSet);
        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet.subSet(100,500));
        System.out.println(treeSet.subSet(100,500).remove(350));//reflects to the original set also
        List<Integer> list = new ArrayList<>(treeSet.subSet(100, 600));
        System.out.println(list);
        System.out.println(treeSet);
        System.out.println(treeSet.ceiling(100));//return smallest number >= 100
        System.out.println(treeSet.floor(100)); //return largest number<=100
        System.out.println(treeSet.higher(100));
        System.out.println(treeSet.lower(100));
        System.out.println(treeSet.isEmpty());


    }
}
