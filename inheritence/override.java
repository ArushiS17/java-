

class TV{
    //methods
    public void SwitchON(){
       System.out.println("TV on");
    }
    public void ChangeChannel(){
        System.out.println("TV channel change");
    }
}
class SmartTV extends TV{
    @Override
    public void SwitchON(){
        System.out.println("SmartTV on");
     }
     @Override
     public void ChangeChannel(){
         System.out.println("SmartTV channel change");
     }
     public void Browse(){
        System.out.println("SmartTV browsing");
     }
}
public class override {
public static void main(String[] args) {
    TV t=new TV();
    t.SwitchON();
    t.ChangeChannel();

    System.out.println();

    SmartTV st= new SmartTV();
    st.SwitchON();
    st.ChangeChannel();
    st.Browse();

    System.out.println();

    //dynamic method dispatch
    TV x= new SmartTV();
    x.SwitchON(); //cant call browse as that method isnt in super class
    


}
}
