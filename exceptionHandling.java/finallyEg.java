

public class finallyEg {
    static void meth1() throws Exception{
        try{
            throw new Exception();
        }
        finally{
            System.out.println("from method");
        }
    }
    public static void main(String[] args) throws Exception {
        try{
            System.out.println(10/5);
        }
        catch(ArithmeticException e){
            System.out.println("division by 0");
        }
        finally{
        System.out.println("final message");
        }
        meth1();
       }
       
}
