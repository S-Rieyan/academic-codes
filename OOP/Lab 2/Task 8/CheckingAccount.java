public class CheckingAccount extends Account{
  static int numberOfAccount;
  double balance;
  CheckingAccount(){
    super(0.0);
    numberOfAccount++;
  }
  CheckingAccount(double b){
    super(b);
    numberOfAccount++;
  }
}