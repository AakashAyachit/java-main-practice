package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(20);

        ArrayList<Integer> al2 = new ArrayList<>(List.of(20,30,40,60));

        al1.add(2);
        al1.add(0,1);
        al1.addAll(1,al2);

        System.out.println(al1);
        System.out.println(al2);
        System.out.println(al2.contains(30));
        System.out.println(al2.get(3));
        System.out.println(al2.indexOf(40));
        al2.add(4,40);
        System.out.println(al2.lastIndexOf(40));

        for (int i = 0; i<al2.size();i++){
            System.out.println(al2.get(i));
        }

        LinkedList<Integer> ll = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(2,4,6867,4,3));


        ll.add(100);
        ll.add(1,3);
        ll.addAll(ll2);
        System.out.println(ll.peek());

        System.out.println(ll);
        System.out.println(ll2);



    }
}
