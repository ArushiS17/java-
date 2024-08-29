import java.util.*;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(20);
        al1.add(10);
        al1.add(0,5);
        ArrayList<Integer> al2= new ArrayList<>(List.of(50,60,70,80,90)); //directly adds elements 

        // al1.addAll(al2); //al1 has all elements of al2 now
        al1.addAll(1, al2); //adds elements at index 1

        System.out.println(al1);
        // System.out.println(al2);
        System.out.println(al1.contains(50)); //checks for elements
        System.out.println(al1.get(5)); //gets element at index 5
    
        al1.add(6, 70);
        System.out.println(al1.indexOf(70));  
        System.out.println(al1.lastIndexOf(70)); 

        al1.set(5,100); //replaced 90
        System.out.println(al1.get(5));
        

        //ITERATING THROUGH ARRAY LIST
        //1) for loop
        // for (int i=0; i<al1.size(); i++){
        //     System.out.println(al1.get(i)); //can't use al1[i]- not an array
        // }

        //2) for each loop
        // for(Integer x: al1){     //u can write var x: al1 also
        //     System.out.println(x);
        // }

        //3)iterator
        // for(ListIterator<Integer> it = al1.listIterator(); it.hasNext();){ //u can use while loop also
        //     System.out.println(it.next());
        // }

        //4) lamba expressions
        // al1.forEach(n-> System.out.println(n));

        // al1.forEach(System.out::println);

        al1.forEach(n-> show(n));
    }
    static void show(int n){
        if(n>60)
        System.out.println(n);
    }
}
