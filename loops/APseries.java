import java.util.Scanner;

public class APseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first term: ");
        int a = sc.nextInt();
        System.out.println("enter common difference: ");
        int d = sc.nextInt();
        System.out.println("enter length of series: ");
        int n = sc.nextInt();

        int series = a;
        for(int i=0; i<n; i++){
            System.out.print(series + ",");
            series = series + d;
        }
    }
}
