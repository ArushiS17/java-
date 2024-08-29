abstract class My{
    abstract public void show();
    //instead of abstract can be an interface also
}
class Outer{
    public void display(){
        //anoynymous class inherirting from class my
        My m= new My(){
            //method and body
            public void show(){
                System.out.println("hello");
            }
        }; //semicolon required
        // m.show();
    }
}

public class anonymous {
    public static void main(String[] args) {
        Outer o= new Outer();
        o.display(); //displays show
    }
}
