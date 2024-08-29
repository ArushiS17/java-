
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        System.out.println("enter marks of 3 subjects");
        Scanner sc = new Scanner(System.in);
        
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        System.out.println("Marks are" + m1 + " " +  m2 + " "+ m3);

        int Total = m1 + m2 + m3;
        System.out.println("total marks: " + Total);
        int Average = Total / 3;
        System.out.println("Average of marks: " + Average);

        if(Average >= 70){
            System.out.println("Grade: A");
        } else if (Average >= 60 && Average < 70){
            System.out.println("Grade: B");
        } else if (Average >= 50 && Average < 60){
            System.out.println("Grade: C");
        } else if (Average >= 40 && Average < 50){
            System.out.println("Grade: D");
        } else if (Average < 40){
            System.out.println("Grade: E");
        }

    }
}
