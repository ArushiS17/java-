class product{
    public String itemNum;
    public String name;
    public double price;
    public int quantity;
//properties
//get
    public String getitemNum(){return itemNum;}
    public String getname(){return name;}
    public double getprice(){return price;}
    public int getquantity(){return quantity;}
//set
    public void setPrice(int p){
        price = p;
    }

//constructor
public product(String item){
    itemNum=item;
}
public product(String item, String n){
    itemNum=item;
    name=n;

}
public product(String item, String n, double p, int qty){

    itemNum=item;
    name=n;
    setPrice(p);
    setquantity(qty);
}


}

public class customerProduct {
    public static void main(String[] args) {
        
    }
}
