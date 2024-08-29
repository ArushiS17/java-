class Outer{
    int x=10;
    static int y=10;

    static class My{
        //method
        public void show(){
            // System.out.println(x); //not static cant be displayed
            System.out.println(y);
        }
    }
}

public class StaticInner {
    public static void main(String[] args) {
        Outer.My m= new Outer.My();
        m.show();
    }
    
}
