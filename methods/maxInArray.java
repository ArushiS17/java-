

public class maxInArray {
    static int max(int A[]){
        int max= A[0];
        for(int i=0; i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[]= {2,7,8,4,0,10,77,41,9};
        System.out.println(max(a));
    }
}
