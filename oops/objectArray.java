class Subject{
    private int subId;
    private String name;
    private int maxMarks;
    private int marksObtained;

    
//constructors
public Subject(int subId, String name, int maxMarks){
    this.subId=subId;
    this.name=name;
    this.maxMarks=maxMarks;
}

//property methods
public int getSubId(){return subId;}
public String getName(){return name;}
public int getMaxMarks(){return maxMarks;}
public int getMarksObtain(){return marksObtained;}

public void setMaxMarks(int max){
    maxMarks=max;
}
public void setMarksObtain(int obtained){
    marksObtained=obtained;
}
boolean isQualified(int m){
    return marksObtained>=maxMarks/10*4; //40%
}
public String toString(){
    System.out.println("Subject details: ");
    return "\n SubjectID: "+subId+"\n Name: "+name+"\nMarks Obtained"+ marksObtained;
}
}

class Student{
    private int rollNo;
    private String name;
    private String dept;
    private Subject[] subjects;

//constructor
public Student(int rollNo, String name, String dept ){
    this.rollNo= rollNo;
    this.name=name;
    this.dept=dept;
}
public Student(int rollNo, String name, String dept, Subject[] subs ){
    this.rollNo= rollNo;
    this.name=name;
    this.dept=dept;
    subs=new Subject[0];
}
//property methods
public int getRollNo(){return rollNo;}
public String getName(){return name;}
public String getDept(){return dept;}
public Subject[] getSubjects(){return subjects;}

public void setSubjects(Subject ...s) {
    subjects = new Subject[s.length];
    for(int i=0;i<s.length;i++){
        subjects[i]=s[i];
    }
}
public String toString() {
    System.out.println("Student detaisl: ");
    return "RollNo:"+rollNo+"\nName:"+name+"\nDept:"+dept;
}



public class objectArray {
    public static void main(String[] args) {
        Subject subs[]=new Subject[3]; //array

        //creating array of objects.
        subs[0]=new Subject(1011,"science",100);
        subs[1]=new Subject(1045,"math",100);
        subs[2]=new Subject(1001,"english",100);

        //printing array
        for(Subject s:subs){
            System.out.println(s); //toString method called here
        }
        
        Student stud1 = new Student(1,"Jack", "CS");
        Student stud2 = new Student(1,"Ben", "IT");
        System.out.println(stud1);
        System.out.println(stud2);

}

}
        

}

