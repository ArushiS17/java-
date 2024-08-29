package strings;
public class RegularExp {
    public static void main(String[] args) {

        // .  any char
        String str1="&"; //any single digit or alphabet or % * etc anything single
        System.out.println(str1.matches("."));
        //[abc] any 1 of these 3
        String str2="a"; // "ab" pe false, either of these only
        System.out.println(str2.matches("([abc])"));
        //[abc][vz] either 1 of each of these sets
        String str3 = "av";
        System.out.println(str3.matches("[abc][vc]"));
        //[^abc] except abc
        String str4 = "y";
        System.out.println(str4.matches("[^abc]"));
        //[a-z1-7] a-z or 1-7
        String str5 = "9";
        System.out.println(str5.matches("[a-zA-Z1-7]"));
        //A|B A or B
        String str6 = "A";
        System.out.println(str6.matches("[A|B]"));
        //XZ exactly XZ


//-------META CHARACTERS-------------
// \d-digits or use \\
    String str7 = ("a");
    System.out.println(str7.matches("\\D"));
// \D- not digits
// \s space
// \S not space
// \w aphabet or digits
// \W neither alphabet or digit

//-----------QUANITFIWERS-----------
//* 0 or more times eg: [abc]* = abc aabbcc accbba
//+ one or more times
//? 0 or 1 time
//{X} X times eg:[a-z]{5}
//{X,Y} Between X and Y times

String str8= "abcdef";
System.out.println(str8.matches("[abc]*")); //[abc]* = abc aabbcc accbba

//eg- gmail account
String str9= "john@gmail.com";
System.out.println(str9.matches("\\w*@gmail(.*)")); //alphabets and digits before @gmail (\\w), anything after gmail, any no. of times

    }
}
