package strings;

public class Strings {
    public static void main(String[] args) {
        String str1=("hello");

        String str2 = new String("whats up");
    
        char c[]= {'h','e','l','l','o'};
        // u can mention starting index and no. of characters
        String str3 = new String(c,1,4);
    
        byte b[] = {65,66,67,68};
        String str4 = new String(b,1,2);
    
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
