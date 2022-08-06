// Name :- Daksh Bangoria
// Roll-no :-21ce007
// • A private double data field named balance for the account (default 500₹).
// • A private double data field named annualInterestRate that stores the current
// interest rate (default 7%). Assume all accounts have the same interest rate.
// • A private Date data field named dateCreated that stores the date when the
// account was created.
// • A no-arg constructor that creates a default account.
// • A constructor that creates an account with the specified id and initial balance.
// • The accessor and mutator methods for id, balance, and annualInterestRate.
// • The accessor method for dateCreated.
// • A method named getMonthlyInterestRate() that returns the monthly interest rate.
// • A method named getMonthlyInterest() that returns the monthly interest.
// • A method named withdraw that withdraws a specified amount from the account.
// • A method named deposit that deposits a specified amount to the account.
// Aim :-Design a class named Account that contains:
// • A private int data field named id for the account (default 0).
// Git-hub repository: https://github.com/Daksh3468/JAVA-Assignment-2

import java.util.*;

public class Daksh2_2main {
    public static void main(String[] args) {
        System.out.println("An example for you to to create a proper account :");
        Account d2_1 =new Account();//calling and printing default constructor
        d2_1.Accessor();
        Scanner s = new Scanner(System.in);
        
        int id;
        double balance,withdraw,deposit,monintrate,monint;
        String date;
        System.out.println("Enter the Account number of your account  :");
        id = s.nextInt();
        System.out.println("Enter the initial balance your account  :");
        balance = s.nextDouble();
        System.out.println("Enter the date at which you created your account  :");
        date = s.next();
        
        Account d2_2 = new Account(id, balance, date);
        d2_2.Accessor();//calling and printing parameterized construstor
        monintrate = d2_2.getMonthlyInterestRate();//getting monthly intrest rate and rupees
        monint = d2_2.getMonthlyInterest();
        System.out.println("Bank give "+monintrate+"% monthly intrest rate.");//printing monthly intrest rate and rupees
        System.out.println("Your monthly intrest is "+monint+" Rupees");
        int i;

        System.out.println("Enter 1 to withdraw and 2 to deposit.");
        i = s.nextInt();//giving choice to the costomer to withdraw or to deposit the money.
        switch(i)
        {
            case 1 :
            {
                System.out.println("Enter amount to be withdrawn  :");
                withdraw = s.nextDouble();
                d2_2.withdraw(withdraw);//withdrawing withdraw ammount of money from account
                System.out.println("The amount remained in your account after withdrawal is   :"+d2_2.balance);
                break;
            }
            case 2 :
            {
                System.out.println("Enter amount to be deposited  :");
                deposit = s.nextDouble();
                d2_2.deposit(deposit);//depositing deposit ammount of money to account
                System.out.println("The amount remained in your account after deposit is   :"+d2_2.balance);
                break;
            }
            default :
            {
                System.out.println("You have changed anything  :");
                break;
            }
        }
        System.out.println("Your account afer withdrawal or deposit  :");
        d2_2.Accessor();//printing account details after withdrawing or depositing.

        int p=1;
        while(p==1)
        {
            System.out.println("Enter 1 use another account and 2 to not.");//continuing it again and again until account holder gives input 2
            i = s.nextInt();//giving choice to account holder to change the account or not
            if(i==1)//if account holder changes the account the repeating above procedure again 
            {
                System.out.println("Enter the Account number of your account  :");
                id = s.nextInt();
                System.out.println("Enter the initial balance your account  :");
                balance = s.nextDouble();
                System.out.println("Enter the date at which you created your account  :");
                date = s.next();

                d2_2.mutator(id, balance, date);
                d2_2.Accessor();
                monintrate = d2_2.getMonthlyInterestRate();
                monint = d2_2.getMonthlyInterest();
                System.out.println("Bank give "+monintrate+"% monthly intrest rate.");
                System.out.println("Your monthly intrest is "+monint+" Rupees");
                System.out.println("Enter 1 to withdraw and 2 to deposit.");
                i = s.nextInt();
                
                switch(i)
                {
                    case 1 :
                    {
                        System.out.println("Enter amount to be withdrawn  :");
                        withdraw = s.nextDouble();
                        d2_2.withdraw(withdraw);
                        System.out.println("The amount remained in your account after withdrawal is   :"+d2_2.balance);
                        break;
                    }
                    case 2 :
                    {
                        System.out.println("Enter amount to be deposited  :");
                        deposit = s.nextDouble();
                        d2_2.deposit(deposit);
                        System.out.println("The amount remained in your account after deposit is   :"+d2_2.balance);
                        break;
                    }
                    default :
                    {
                        System.out.println("You have changed anything  :");
                        break;
                    }
                }
            }
            else 
            {
                System.out.println("--------------thanks for coming---------------------");
                break;
            }
        }
    }
}