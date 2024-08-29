
import java.util.Scanner;
public class displayDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. ");
        int n = sc.nextInt();

        while(n > 0){
            int r = n % 10;
            n = n/10; //integer division not float division
            System.out.println(r);
        }
    }
}
