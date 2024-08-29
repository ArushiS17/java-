package loops;
import java.util.Scanner;

public class sumOfN_num {
    public static void main(String[] args) {
        
        System.out.println("enter N numbers:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i;
        int sum= 0;


        for(i = 1 ; i <= n; i++){
            sum = sum + i;
            
        }System.out.println(sum);
        

    }
}
