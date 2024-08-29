package strings;

public class equals {
    public static void main(String[] args) {

    String str1=("java"); //created in pool
    String str2=("java"); //2 references, same object
    String str3= new String("java"); //created in heap

    System.out.println(str1.equals(str2)); //compares strings
    System.out.println((str1==str2)); // compares references- if they're pointing to same obj

    System.out.println(str3.equals(str1)); //strings equal
    System.out.println((str3==str1)); //str3 is refernecing to "java" in heap, str1 refers to "java" in pool
        
    }
}
