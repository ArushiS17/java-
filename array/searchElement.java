import java.util.Scanner;
public class searchElement {
    public static void main(String[] args) {
        //no duplicates in array
        int A[] = {3,9,7,8,12,6,15,5,4,10};

        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        
        for( int i= 0; i<A.length; i++){
            if( A[i] == n){
                System.out.println("element in array at index " + i);
                System.exit(0);
            }// cant write else in the for loop as we need to traverse the whole array first
        }System.out.println("elemnt not found in array");
        
        
    }
}
