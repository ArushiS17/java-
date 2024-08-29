// package loops;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();

        int sum = 0;
        int m = n;
        while(n>0){
            int r = n % 10; //dont use math.pow as we want integer results- wont give precise answer (treats 1 as 0.99999)
            sum = sum + (r*r*r);
            n = n/10;
        }// once the loop ends, value of n becomes zero. give n = m
        if (sum == m){
            System.out.println("armstrong no. ");
        } else{
            System.out.println("not armstrong no.");
        }
     }

    }

