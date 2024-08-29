import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        System.out.println("enter year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("leap year");
                } else{
                    System.out.println("not a leap year");
                }
            } else {
                System.out.println("may be a leap year");
            }
        } else{
            System.out.println("not a leap year");
        }

        
    }
}
