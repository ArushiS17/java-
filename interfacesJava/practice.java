

public class practice {

    interface Test{
        //abstract methods
        void method1();
        void method2();
    }
    class hello implements Test{
        //overrided methods
        public void method1(){
            System.out.println("method1 of class hello");
        }
        public void method2(){
            System.out.println("method2 of class hello");
        }
        public void method3(){
            System.out.println("method3 of class hello");
        }
    }
    public static void main(String[] args) {
        Test s= new hello(); //refernece can be used of interfaces
        s.method1();
        s.method2();
    }
}
