public class increaingArray {
    public static void main(String[] args) {
        
        int A[]={8,6,10,9,2};
        int B[] = new int[2*A.length]; //or write [10]

        for(int i=0; i<A.length; i++){
            B[i]= A[i];
        }
        A=B;
        B= null;
        System.out.println(A.length);

        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+",");
        }

    


    }
}
