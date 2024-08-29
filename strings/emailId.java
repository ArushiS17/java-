package strings;
public class emailId {
    public static void main(String[] args) {
        String str = "programmer@gmail.com";
        int i = str.indexOf("@");
        String userName = str.substring(0,i);
        String domainName = str.substring(i+1, str.length());
        
        System.out.println("username:" + userName);
        System.out.println("domain:" + domainName);

        
        //int j= domainName.indexOf(".");
        //String name = domainName.substring(0,j);
        //System.out.println(name.equals("gmail"));

        //or
        System.out.println(domainName.startsWith("gmail"));

        
      
    }
}
