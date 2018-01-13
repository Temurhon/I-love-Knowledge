package Bank;

public class SavingsAccount extends Account {
        private double d;
    public SavingsAccount(String id, double initialDeposit) {
        super(id);
         d = initialDeposit;
    }
    public boolean withdraw(double amount){

        if(amount > balance){
            System.out.println("Insufficient Funds!");
            return false;
        }else {
            balance = balance - withdraw(amount);
            return true;
        }

    }
    public void deposit(double amount){
        balance += amount;
    }
}
