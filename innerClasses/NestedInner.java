

class outer{
    int x=10;
    class inner{
        int y=20;
        public void InnerDisplay(){
            System.out.println(x+ " "+ y); //outer class variables can be accessed directly by inner class
        }
    }
    public void OuterDisplay(){
        inner i = new inner(); //object of inner class in outer class
        i.InnerDisplay(); //calling method of inner class
        System.out.println(i.y); //printing value of inner class
        //use object of inner class then by its reference u can access y
    }
}

public class NestedInner {
public static void main(String[] args) {
    outer o = new outer();
    o.OuterDisplay(); //it will call method of outer class which is calling method of inner class

    //directly access inner class
    outer.inner io= new outer().new inner();
    io.InnerDisplay();
    
}
}
