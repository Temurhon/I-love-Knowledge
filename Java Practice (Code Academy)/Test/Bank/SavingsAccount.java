package Bank;

public class SavingsAccount extends Account {

    public SavingsAccount(String id, double initialDeposit) {
        private double d;
        super(id);//the id object is taken from the Account class method.
         d = initialDeposit;//the initial deposit is initialised as d.
    }
    public boolean withdraw(double amount){

        //if the account holds more than 1000 pound, then the account will get +10 pounds inside.


        //if(amount <= 10) {

    //if the amount is bigger than the balance then it will print out insufficient funds, else it will take off the amount from the withdraw amount.

    3

        if (amount > balance) {
                System.out.println("Insufficient Funds!");//prints out insufficient funds
                return false;
            } else {
             balance.equals(double amount);//the balance will be subtracted from the withdraw amount.
                return true;
            }
        //}

    }
    public void deposit(double amount){
        balance += amount;//the amount will be added to the balance.

    }
}
