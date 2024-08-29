import java.util.ArrayList; 
import java.util.LinkedList;
import java.util.List;

public class LinkedListeg {
    public static void main(String[] args) {

        LinkedList<Integer> ll= new LinkedList<>();
        LinkedList<Integer> ll1= new LinkedList<>(List.of(50,60,70,80,90)); 


        ll.add(10);
        System.out.println(ll);

        ll.add(0,5);
        ll.addAll(1, ll1);
        System.out.println(ll);

        ll.forEach(n-> show(n));
        ll1.addFirst(200); //ll method
        System.out.println(ll1);
        
    }
    static void show(int n){
        // if(n>40){
            System.out.println(n);
        }
    }

