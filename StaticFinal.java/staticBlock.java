class Test{
    static{
        System.out.println("block in other class");
        //if class is not loaded static blocks wont execute
    }
}
public class staticBlock {
    //outisde main
    static{
        System.out.println("block1");
    }
    public static void main(String[] args) {  
        Test t= new Test(); //creating object of class test to load class
        System.out.println("main");  
        //executes after executiing static blocks
        
    }
    //after main
    static{
        System.out.println("block2");
    }
}
