

public class maxElement {
    static int max(int ...A){
        if(A.length==0) return Integer.MIN_VALUE; //in case there are 0 entries, u have to return some answer
        int m=A[0];
        for(int i =0; i<A.length;i++){
            if(A[i]> m){
                m=A[i];
            } 
        }
        return m;
    }
    public static void main(String[] args) {
        System.out.println(max()); //gives min integer value
        System.out.println(max(10));
        System.out.println(max(20,30,40));
        System.out.println(max(777,888,666));
    }
}
