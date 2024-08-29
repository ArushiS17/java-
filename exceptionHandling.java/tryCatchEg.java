
import java.util.Scanner;
public class tryCatchEg {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc= new Scanner(System.in);
        System.out.println("give 2 nos. ");
        a=sc.nextInt();
        b=sc.nextInt();

        try{
            c=a/b;
            System.out.println("result: "+ c);
        }
        catch(ArithmeticException e){
            System.out.println("error: division by 0 " + e);       
        }
        
        System.out.println("end of calculation");

    }
}
