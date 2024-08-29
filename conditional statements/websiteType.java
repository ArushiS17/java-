
import java.util.Scanner;

public class websiteType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("website name:");
        String domain = sc.nextLine();

        String ext= domain.substring(domain.lastIndexOf(".")+1);

        switch(ext){
            case "com": System.out.println("commercial");
            break;
            case "net": System.out.println("network");
            break;
            case "org": System.out.println("organisation");
            break;
            case "gov": System.out.println("government");
            break;

        }

        
    }
}
