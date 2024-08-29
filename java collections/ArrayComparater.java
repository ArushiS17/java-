import java.util.*;

class myComparater implements Comparator<Integer>{
    public int compare(Integer i1, Integer i2){
        if(i1<i2) return 1;
        if(i2>i2) return -1;
        return 0;

    }
}

public class ArrayComparater {
    public static void main(String args[]){
        int a[]= {2,4,6,8,1,3,5,7};
        int b[]={2,4,6,8,1,3,5,7};

        System.out.println(Arrays.compare(a, b)); //gives 0 if same. //-1 if arr1 < arr2, 1 if arr1 > arr2 [LENGTH & ELEMENT ALSO]

        int c[] = Arrays.copyOf(a, 4);
        for(int x: c){
            System.out.print(x);
        }

        System.out.println(" ");

       Arrays.sort(a);
       for(int x: a){
        System.out.print(x);
    }
    System.out.println(" ");

    //binary search on sorted array
     System.out.println(Arrays.binarySearch(a, 2));

     Integer A[] = {2,4,6,8,1,3,5,7};
     Arrays.sort(A, new myComparator());
     for(int x:A){
        System.out.println(x);
     }

    }
}
