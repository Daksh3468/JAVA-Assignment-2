
public class SavingsAccount extends Account {
    protected double OVERDRAFT_LIMIT = 0;

    public SavingsAccount(int id, double balance,String date) {
        super(id, balance, date);//creates the saving account
    }

    @Override
    public void withdraw(double amount) {//as their is no overdraft limit so method to withdraw any ammount of money.
        if (balance - amount >= OVERDRAFT_LIMIT || balance - amount <= OVERDRAFT_LIMIT) 
            super.withdraw(amount);
        }
    

    @Override
    public String toString() {
        return "SavingsAccount{" + "net Balance =" + balance +'}';//overriding the to string method for printing the savings account balance
    }
}