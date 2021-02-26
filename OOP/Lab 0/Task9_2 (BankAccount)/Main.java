public class Main{
    public static void main (String args[]){
        BankAccount acc1 = new BankAccount("John","Mohakhali","1232311", 10000.0);
        BankAccount acc2 = new BankAccount("Mike","Mirpur","1232432", 10000.0);
        BankAccount acc3 = new BankAccount("Carol","Gulshan","1232324", 10000.0);
        
        acc1.addInterest();
        acc3.addInterest(); 
        System.out.println(acc1.getName());
        System.out.println(acc1.getAccountID());
        System.out.println(acc1.getAddress());
        System.out.println(acc1.getBalance());
        System.out.println(acc2.getName());
        System.out.println(acc2.getAccountID());
        System.out.println(acc2.getAddress());
        System.out.println(acc2.getBalance());
        System.out.println(acc3.getName());
        System.out.println(acc3.getAccountID());
        System.out.println(acc3.getAddress());
        System.out.println(acc3.getBalance());
    }
}