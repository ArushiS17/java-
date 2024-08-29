import java.util.Scanner;
public class website {
    public static void main(String[] args) {
        System.out.println("enter the webiste url: ");
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();

        String protocol = url.substring(0, url.indexOf(":"));
        if (protocol.equals ("http")){
            System.out.println("hypertext transfer protocol");
        } else if (protocol.equals ("https")){
            System.out.println("hypertext transfer protocol secure");
        } else if (protocol.equals ("ftp")){
            System.out.println("file transfer protocol");
        }

        String domain = url.substring( url.lastIndexOf(".")+1); //after dot onwards
        if (domain.equals("com")){
            System.out.println("commercial");
        } else if ( domain.equals ("net")){
            System.out.println("network");
        } else if ( domain.equals ("gov")){
            System.out.println("governemnt");
        }

    }
}
