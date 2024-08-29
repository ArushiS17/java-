import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
       
         int i;
         Scanner sc = new Scanner(System.in);
         System.out.println("enter no. ");
         i = sc.nextInt();

         if(i % 2 == 0){
            System.out.println(i + " is even");
         }else{
            System.out.println(i+ " is odd");
         }
         
           
        }
    }


