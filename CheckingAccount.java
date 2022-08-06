

public class CheckingAccount extends Account {
    protected double OVERDRAFT_LIMIT = -100;//putting a limit for overdrafting

    public CheckingAccount(int id, double balance,String date) {
        super(id, balance,date);//creating a checking account
    }

    @Override
    public void withdraw(double amount) {//withdrawing and overdrafting money from checking account.
        if (balance - amount >= OVERDRAFT_LIMIT) {//if the overdrafting limit is passsed the no money is withdrawn if not the money is allowed to be withdrawn.
            super.withdraw(amount);
        }
        else
        System.out.println("Over drawing is passing the given limit  :");
    }

    @Override
    public String toString() {
        return "CheckingAccount{"+ "mBalance=" + balance +'}';//overriding the to string method for printing the checking account balance
    }
}
