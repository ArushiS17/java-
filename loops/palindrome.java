package loops;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();

        int rev = 0;
        int m=n;
        while(n>0){
            int r= n%10;
            rev = rev * 10 +r;
            n = n/10;
        }
        if (rev == m){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
