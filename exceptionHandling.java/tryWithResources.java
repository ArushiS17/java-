import java.io.*;
import java.util.*;

public class tryWithResources {
    static FileInputStream fi; //used to read data from files
    static void Divide() throws FileNotFoundException {
        fi= new FileInputStream("C:/Users/itsar/Downloads/JavaUdemy/exceptionHandling.java/trywResources.txt");
        Scanner sc= new Scanner(fi);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        System.out.println(a/b);
    }


        public static void main(String[] args) throws Exception{
        Divide();
    }

}
