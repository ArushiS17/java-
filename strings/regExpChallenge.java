package strings;

public class regExpChallenge {
    public static void main(String[] args) {
        //Q1- check binary
        int b = 101101;
        String str = b + "";
        System.out.println(str.matches ("[0|1]+"));

        //Q2- check hexadecimal 
        //ans: [0-9A-F]+

        //Q3- check date format (dd/mm/yyyy)
        String d = "01/09/2002";
        System.out.println(d.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));

        //remove special characters from string
        String special = "a!B@c#1$2%3";
        System.out.println(special.replaceAll("[^a-zA-Z0-9]", ""));

        //reomove extra spaces from string
        String space = "  abc    def        ghi  ";
        System.out.println(space.replaceAll("\\s", ""));

        //find no. of WORDS in the string
        





    
    }
}
