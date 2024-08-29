import java.util.Scanner;
public class GPseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first term: ");
        int a = sc.nextInt();
        System.out.println("enter common ratio: ");
        int r = sc.nextInt();
        System.out.println("enter length of series: ");
        int n = sc.nextInt();

        int series = a;
        for(int i = 0; i<n; i++){
            System.out.print(series + " ");
            series = series * r;

        }
    }
}
