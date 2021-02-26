public class CheckingAccount extends Account{
    CheckingAccount(String n, double b){
        super(n);
        setBalance(b);
    }
    
    public void printAccountInfo(){
        System.out.println("=======================================");
        System.out.println("Name : "+ getName());
        System.out.println("Account Number : "+ getAccountNumber());
        System.out.println("Balance : "+getBalance());
        if (getBalance() < 500){
            System.out.println("Your balance is less than the minimum amount");
        }
        System.out.println("=======================================");
    }
    String deposit(double d ){
        if (d<=0){
            return "Please enter amount greater than Zero";
        }
 
        else {
            setBalance(d+getBalance());
            return "Deposit Successful";
        }
    }
    
    Object withdraw(double d ){
        if (d<=0){
            return "Please enter amount greater than Zero";
        }
        else if (getBalance() < d) {
            return "You do not have enough funds";
            
        }
        else {
            setBalance(getBalance()-d);
            return "Withdraw Successful";
        }
        
    }
}