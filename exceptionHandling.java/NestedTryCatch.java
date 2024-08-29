

public class NestedTryCatch {
    public static void main(String[] args) {
        int A[]= {10,20,30,40,50,0};

        try{
            int c= A[0]/A[5];
            System.out.println("result is: "+ c); //if exception here, other statements wont execute(wont show out of bound exception if its there)

            try{
                System.out.println(A[10]); //out of bound
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("array out of bounds " + e);
            }  
        }
        catch(ArithmeticException e){
            System.out.println("division by 0 error "+ e);
        }
        System.out.println("end of program.");
    }
}
