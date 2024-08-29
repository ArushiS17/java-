import java.util.*;

class Student{
    private String RollNum;
    private static int cnt=1;

    private String GenerateRollno(){
        Date d= new Date(); //imports date
        String rn= ("Univ-"+ (d.getYear()+1900)+"-"+cnt);
        cnt++;
        return rn;
    }
    public Student(){
        RollNum= GenerateRollno();
    }
    public String getRollNum(){
        return RollNum;
    }
}

public class generateRollNum {
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2= new Student();
        Student s3= new Student();

        System.out.println(s1.getRollNum());
        System.out.println(s2.getRollNum());
        System.out.println(s3.getRollNum());
    }
}
