import java.util.Scanner;
public class radix {
    public static void main(String[] args) {
        System.out.println("enter your number: "  );
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        

        if(num.matches("[01]+")){
            System.out.println("Binary no.");
        } else if (num.matches("[0-7]+")){
            System.out.println("Octal no.");
        }else if (num.matches("[0-9]+")){
            System.out.println("decimal no.");
        } else if( num.matches("[0-9A-F]+")){
            System.out.println("hexadecimal no.");
        } else{
            System.out.println("invalid no. ");
        }
    }
}
