package strings;
public class JavaPool {
    public static void main(String[] args) {
        String str1="java";
        String str2="java";
        String str3="Java";
        String str4= new String("java");
        
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);

    }
}
