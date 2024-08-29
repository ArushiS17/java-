
class Outer{
    public void display(){
        class Inner{ //local inner class inside display
            public void show(){
                System.out.println("yoo");
            }

        }
        Inner i= new Inner();
        i.show(); //inside display method only
    }
}
public class localInner {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display(); //printes local inner class method of show

    }
}
