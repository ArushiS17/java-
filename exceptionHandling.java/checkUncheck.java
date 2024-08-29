import java.io.*;

class lowBalanceException extends Exception{ 
    public String toString(){
        return "balance >=5000";
    }

}
public class checkUncheck {
    static void fun1(){
        try{
            System.out.println(10/0); //unchecked exception
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
       
    }
    static void fun2(){
        FileInputStream fi= new FileInputStream("my.text"); //checked exception
    }
    static void fun3(){
        try{
            throw new lowBalanceException();
        }
        catch(lowBalanceException e){
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
        fun3();
    }
}
