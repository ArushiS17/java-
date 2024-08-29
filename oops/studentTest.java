class student{
    public int rollno;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total(){
        return m1+m2+m3;
    }
    public float average(){
        return (float) total()/3;
    }
    public char grade(){
        if (average()>=70){
           return 'A';
        }
        else{
            return 'B';
        }
    }
    public String toString(){
        return "roll no."+rollno+"\n"+"Name: " +name+"\n"+"Course: "+ course+"\n";
    }
}

public class studentTest {
    public static void main(String[] args) {
        student Student1 = new student();
        student Student2 = new student();

        Student1.name= "sara"; Student1.rollno=34; Student1.course="science";
        Student1.m1=70; Student1.m2=80; Student1.m3=75;
        Student2.name= "jyotsna"; Student2.rollno=14; Student2.course="science";
        Student2.m1=80; Student2.m2=70; Student2.m3=40;


        System.out.println(Student1); //to print the object itself, object should have toString method implemented.
        System.out.println(Student1.total());
        System.out.println(Student1.average());
        System.out.println(Student1.grade());
        System.out.println();
        System.out.println(Student2);
        System.out.println(Student2.total());
        System.out.println(Student2.average());
        System.out.println(Student2.grade());


    }
}
