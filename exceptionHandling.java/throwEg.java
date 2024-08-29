

public class throwEg {

    //defining own class of exception:
    class NegativeDimensionException extends Exception{
        public String toString(){
            return "dimension cant be negative" ;
        }
    }
    static int area(int l, int b) throws NegativeDimensionException{
        if(l<0 || b<0) 
            throw NegativeDimensionException();//creating object of exception
        return l*b;
        
    }
    static void meth1() throws NegativeDimensionException{
        System.out.println(area(-10,15));
    }

    public static void main(String[] args) {
      try{
        meth1();
      }
      catch(NegativeDimensionException e){
        System.out.println(e);
      }
        
    }
       
}

