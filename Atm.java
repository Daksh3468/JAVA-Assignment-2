
public class Atm {
    private static int count;
    private final String id;
    private double balance;

    public String getId() {
        return id;//returns account no.
    }

    public double getBalance() {
        return balance;//returns balance of account after using atm
    }

    public Atm() {
        count++;
        if (count < 10) {
            id = "AC00" + (count);
        } else {
            id = "AC0" + (count);
        }
        balance = 300;
    }//construxtor to create account no and giving all account of minimal balance of 300 rs.

    public void withdraw(double money) {
        if (balance - money >= 300) {
            balance -= money;
            System.out.println(money + " Rs successfully withdrawn.");
            System.out.println("Remaining Balance is : " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw the amount.");
        }
    }//function checking if the ammount to withdrawn keeps the minimal ammount in account of 300 rs or not
    //if yes the reduces the balance balance of the account

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "Rs deposited to your account.");
        System.out.println("Current Balance is : " + balance);
    }//add the ammount to be deposited in the account balance

    public void MoneyTransfer(Atm obj, double amount) {
        if (balance - amount >= 300) {
            balance -= amount;
            obj.balance += amount;
            System.out.println(amount + " Rs successfully Transferred.");
            System.out.println("Remaining Balance is : " + balance);
        } //function checking if the ammount to withdrawn from account from which money is to be transfered keeps the minimal ammount in account of 300 rs or not
        //if yes the reduces the balance balance of the account
    
        else {
            System.out.println("Insufficient balance to transfer the amount.");
        }
    }
    
}