public class Main{
    public static void main (String args[]){
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        BankAccount acc3 = new BankAccount();
        acc1.setName("John");
        acc1.setAccountID("123");
        acc1.setAddress("Mohakhali");
        acc1.setBalance(10000.0);
        acc2.setName("Mike");
        acc2.setAccountID("323");
        acc2.setAddress("Gulshan");
        acc2.setBalance(10000.0);
        acc3.setName("Carol");
        acc3.setAccountID("434");
        acc3.setAddress("Mirpur");
        acc3.setBalance(10000.0);
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