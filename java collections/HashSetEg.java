
import java.util.*;
public class HashSetEg {
public static void main(String[] args) {
    HashSet<Integer> hs = new HashSet<>(20, 0.5f);
    hs.add(10);
    hs.add(20);
    hs.add(30);
    hs.add(10);

    System.out.println(hs);
}
}

