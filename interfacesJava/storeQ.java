

interface Member{
    public void callback();
}
class store{
    Member mem[]= new Member[10]; //array of 10 members
    int count = 0;

    void register(Member m){
        mem [count ++]= m;
    }
    void inviteSale(){
        for(int i=0; i<count;i++){
            mem[i].callback();
        }
    }

    class cust implements Member{
        String name;
        //constructor
        cust(String n){
            name=n;
        }
        public void callback(){
            System.out.println("okk"+ name);
        }
    }
    
}
public class storeQ {
    public static void main(String[] args) {
        store s= new store();
        cust c1=new cust("John");
        cust c2=new cust("Smith");
        
        s.register(c1);
        s.register(c2);
        
        s.inviteSale();

    }
}
