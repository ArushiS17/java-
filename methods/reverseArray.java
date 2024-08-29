
public class reverseArray {

    static int reverse(int n){
        int rev=0;
        while(n>0){
            int r = n%10;
            rev= rev*10+r;
            n=n/10;
        } return rev;
    }
    static int[] reverse(int A[]){
        int B[]= new int[A.length];
        
        for(int i=A.length-1, j=0; i>=0; i--, j++){
            A[j]=B[i];
        }
        return B;
    }
    public static void main(String[] args) {
        System.out.println(reverse (int A [2,3,4,5,6]));
    }
}
