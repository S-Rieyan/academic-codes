public class BankAccount{
    String name;
    String accountID;
    String address;
    double balance;
    
    public BankAccount(String n, String a, String i, double b){
        name = n;
        accountID = i;
        address = a;
        balance = b;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String getAccountID(){
        return accountID;
    }
    public void setAccountID(String i){
        accountID = i;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String a){
        address = a;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double c){
        balance = c;
    }
    public void addInterest() {
        balance += balance*0.07;
    }
    
}