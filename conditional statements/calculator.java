import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers: ");
        Integer Num1 = sc.nextInt();
        Integer Num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("enter operation: ");
        String operator = sc.nextLine();
        

        operator=operator.toUpperCase();
        int result;
        switch(operator){
            case"ADD":  result = Num1 + Num2;
            System.out.println("sum is " + result);
            break;
            case "SUB": result = Num1-Num2;
            System.out.println("difference is " + result);
            break;
            case "MUL": result = Num1 * Num2;
            System.out.println("product is " + result);
            break;
            case "DIV": result = Num1/Num2;
            System.out.println("quotient is " + result);
            break;
        }



    }
}
