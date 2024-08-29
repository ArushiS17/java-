import java.util.ArrayDeque;

public class ArrayDequeueEg {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        // dq.add(50);

        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        dq.pollLast(); //behaves like stack. inserting and deletion from last
        dq.pollFirst(); //behaves like a queue. inserting from last, deleting from first
        System.out.println(dq);

        dq.forEach((x)-> System.out.println(x)); //lamda ex to print 

        // dq.offerFirst(1);
        // dq.offerFirst(2);
        // dq.offerFirst(3);
        // dq.offerFirst(4);

        // dq.forEach((x)-> System.out.println(x)); //lamda ex to print 




    }
}
