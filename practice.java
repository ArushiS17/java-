
import java.util.Scanner;
class Recursion{
    static void f(int i, int n){
        if(i>n) return;
        System.out.println(i);
        f(i+1, n);
    }
    
}

public class practice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Recursion.f(1,n);
    }
}
