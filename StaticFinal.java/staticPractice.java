class Test1{
    static int x=10;
    int y = 20;

    static void display(){
        //static method
        System.out.println(x);
        // System.out.println(y); //cant display non static memeber
    }
    void show(){
        //non static method
        System.out.println(x); //non static method can access static memebers
        System.out.println(y);

    }
}


public class staticPractice {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.show();
        t1.x=30; //t1 changes for both object as they share the static data memeber
        t1.y=50; //this value only changes for t1 object

        Test1 t2= new Test1();
        t2.show();
    }

}
