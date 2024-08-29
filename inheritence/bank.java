
class Account{
private int accountNum;
private String name;
private String address;
private String PhoneNum;
private String DOB;
protected long balance;

//construtor
public Account(int accountNum, String n, String add, String PhoneNum, String DOB){
    this.accountNum=accountNum;
    name=n;
    add=address;
    this.PhoneNum=PhoneNum;
    this.DOB=DOB;
    balance=0;
}
//methods
public int getAccountNum(){return accountNum;}
public String getName(){return name;}
public String getAddress(){return address;}
public String PhoneNum(){return PhoneNum;}
public String getDOB(){return DOB;}
public long getBalance(){return balance;}

public void setName(String name){
    this.name=name;
}
public void setPhoneNum(String PhoneNum){
    this.PhoneNum=PhoneNum;
}
public void setAddress(String address){
    this.address=address;
}
}

class SavingsAccount extends Account{
    public void deposit(long amt){
        balance+=amt;
    }
    public void withdraw(long amt){
        balance-=amt;
    }
        
}
class LoanAccount extends Account{
    public void EMI(long amt){
        balance-=amt;
    }
    public void repay(long amt{
        if(balance==amt){
            balance=0;
        }
    }

}
public class bank {
    public static void main(String[] args) {
        
    }
}
