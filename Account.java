

import java.util.*;

public class Account {
    static public int id;
    static public double balance;
    final static private double annualInterestRate = 7;//keeping intrest rate constant
    static public String dateCreated;

    public Account() {
        id = 0;
        balance = 500;
        dateCreated = "06/11/2003";//construtor to making an default account
    }

    static Scanner s = new Scanner(System.in);

    public Account(int Ac, double bal, String d) {
        id = Ac;
        balance = bal;
        dateCreated = d;//construtor to making an user definrd account
    }

    public void Accessor() {
        System.out.println("Your Account  :" + id);
        System.out.println("Total balance in your account is  :" + balance + " Rupees");
        System.out.println("The intrest given by the bank is  :" + annualInterestRate);
        System.out.println("The at which your account was created is  :" + dateCreated);//method for printing the account 
    }

    public void mutator(int ac, double bal, String d) {
        id = ac;
        balance = bal;
        dateCreated = d;//method for using different account 
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;//method returning monthly intrest rate
    }

    public double getMonthlyInterest() {
        return (annualInterestRate / 12) * balance / 100;//method returing monthly intrest ruppee
    }

    public void withdraw(double draw) {
        balance =  balance - draw;//method editing balance after withdrawing
    }

    public void deposit(double dep) {
        balance = balance + dep;//method editing balance after depositing
    }

    @Override//overriding to string method for printing account details.
    public String toString() {
        String res = "";
        res += "Account number : " + id + "\n";
        res += "Balance in account is : " + balance + "\n";
        res += "Annual Interest Rate given by bank is : " + annualInterestRate + "\n";
        res += "Date of creation of account is : " + dateCreated + "\n";
        return res;
    }
}