import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of terms in series");
        int n = sc.nextInt();

        int a = 0;
        System.out.print(a + ",");
        int b = 1;
        System.out.print(b+ ",");
        for(int i=0; i<(n-2); i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c+ ",");
        }
    }
}
