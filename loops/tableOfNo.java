
import java.util.Scanner;

public class tableOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. : ");
        int n= sc.nextInt();

        int table;

        for (int i=0; i<=10; i++ ){

            table = n * i;
            System.out.println(n + " x " + i + " = " + table);
        }
        
    }
}
