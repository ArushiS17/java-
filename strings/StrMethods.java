package strings;
public class StrMethods {

    //STRINGS ARE IMMUATBLE. NEW OBJECT IS CREATED WHEN MODIDIED. 
    public static void main(String[] args) {
        String str="Java";
        //.int length()
        int l= str.length();
        System.out.println(l);

        //.String toLowerCase/toUpperCase   
        String str1 = str.toLowerCase(); //STRING OBJECTS ARE IMMUTABLE. 
        System.out.println(str1);       // this creates a new string with all lower case the returns to as a new string.
       str=str.toLowerCase();
       System.out.println(str); //here the same thing isnt modified but same reference is pointing to new reference. This object is created in heap, earlier was in pool.

       //.String trim() -- creates new object, useful when u take input from user and he gives unnecessary spaces.
       String str2= "      Welcome        ";
       str2=str2.trim();
       System.out.println(str2);

       //.string substring(int begin) or (int begin, int end)
       String str3="welcome";
       String sub = str3.substring (3,6); //upto 6th character, not 6th character
       System.out.println(sub);

       //.string replace(char old, char new)
       str3=str3.replace('e','k');
       System.out.println(str3);

       //boolean startsWith or endsWith(String s)
       String str4 = ("www.instagram.com"); //to check if website secured(starts w https)
       System.out.println(str4.startsWith("www")); //to check if website is of organisation (ends w org)
       System.out.println(str4.startsWith("insta",4));

       //char charAt(int index)
       System.out.println(str4.charAt(3));//mention index

       //int indexOf(string s)
       System.out.println(str4.indexOf("i"));
       System.out.println(str4.indexOf("?"));//for a character not in string, index = -1
       System.out.println(str4.indexOf(".",5));//. after index 5(to et 2nd dot index)

       //int lastIndexOf(String s)
       System.out.println(str4.lastIndexOf("."));// same as prev but goes right to left

       //.boolean equals(string s) and equalsIgnoreCase
       String str5=("java");
       String str6= ("java");
       String str7=("JAVA");
       String str10= new String ("java");
       System.out.println(str5.equals(str6));//same case, same spacing
       System.out.println(str5.equals(str7));//case sensitive
       System.out.println(str5==str6);
       System.out.println(str1==str10);
       System.out.println(str5.equalsIgnoreCase(str7));//spacing still false

       //.int compare to (compares stin)
       String str8=("a");
       String str9=("z");
       System.out.println(str8.compareTo(str9));//a comes first in dictionary(is smaller)
       System.out.println(str9.compareTo(str8));//z comes later in dictionary(is larger)

       //string valueof(int i)- u can convert any type of value into a string
       

       //string contains
       String str11= ("hello,");
       String str12=("how are you?");
       System.out.println(str12.contains("how"));
       System.out.println(str11.concat(str12)); //concatination of strings
       // or 
       System.out.println(str11 + str12);


    }
}