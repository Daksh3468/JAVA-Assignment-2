// Name :- Daksh Bangoria
// Roll-no :-21ce007
// Aim :-Use the Account class created as above to simulate an ATM machine. 
// Create 10 accounts with id AC001…..AC010 with initial balance 300₹. The 
// system prompts the users to enter an id. If the id is entered incorrectly, ask 
// the user to enter a correct id. Once an id is accepted, display menu with 
// multiple choices. 
// 1. Balance inquiry
// 2. Withdraw money [Maintain minimum balance 300₹]
// 3. Deposit money
// 4. Money Transfer
// 5. Create Account
// 6. Deactivate Account
// 7. Exit 
// Hint: Use ArrayList, which is can shrink and expand with compared to Array.
// Git-hub repository: https://github.com/Daksh3468/JAVA-Assignment-2

import java.util.*;
    
    public class Daksh2_3main
     {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String id = "";
            String id2 = "";
            boolean flag = true;
            int choice;
            double amt;
            ArrayList<Atm> people = new ArrayList<Atm>();//creating an arraylist named people and using it to acccess the class Atm's constructor creating the default account 
            for (int i = 1; i <= 10; i++) {
                people.add(new Atm());//creates 10 account
            }
            System.out.print("Enter Your Account Number : ");
            id = sc.next();
            int userNumber = userID(id, people);
    
            while (flag) {//asking the tasks of the Atm to user until user exits.
                System.out.println();
                System.out.println("Make a choice......");
                System.out.println("1.Balance inquiry ");
                System.out.println("2.Withdraw money ");
                System.out.println("3.Deposit money");
                System.out.println("4.Money Transfer ");
                System.out.println("5.Create Account ");
                System.out.println("6.Deactivate Account");
                System.out.println("7.Exit ");
                choice = sc.nextInt();//asking user to make choice for using functions of the atm
                switch (choice) {//accordingly using the metods created in the ATm class.
                    case 1 -> {
                        System.out.println("Account Number : " + id);
                        System.out.println("Current Balance : " + people.get(userNumber).getBalance());
                    }
                    case 2 -> {
                        System.out.print("Enter Amount To Withdraw : ");
                        amt = sc.nextDouble();
                        people.get(userNumber).withdraw(amt);
                    }
                    case 3 -> {
                        System.out.print("Enter Amount To Deposit : ");
                        amt = sc.nextInt();
                        people.get(userNumber).deposit(amt);
                    }
                    case 4 -> {
                        System.out.print("Enter Account Number To Transfer Money :");
                        id2 = sc.next();
                        int u2 = userID(id2, people);
                        System.out.print("Enter Amount To Transfer : ");
                        amt = sc.nextInt();
                        people.get(userNumber).MoneyTransfer(people.get(u2), amt);
                    }
                    case 5 -> {
                        people.add(new Atm());
                        System.out.println("Account Created Successfully.");
                        System.out.println("The New Account Number Is :" + people.get(people.size() - 1).getId());
                    }
                    case 6 -> {
                        people.remove(userNumber);
                        System.out.println("Account Deleted Successfully.");
                        flag = false;
                    }
                    case 7 ->{ 
                        flag = false;
                        System.out.println("---------------------------Thank you-------------------------------");
                    }
                    default -> System.out.println("Make a valid choice..");
                }
            }
    
        }
    
        public static int userID(String id, ArrayList<Atm>people) {//checks if the entered userId exists or not if yes the return the an number which assigned to a specific entered
                                                                   //userId and helps to use the account accordingly.
            Scanner s = new Scanner(System.in);
            int user = 10000;
            int i;
            for (i = 0; i < people.size(); i++) {
                if (id.equals(people.get(i).getId())) {
                    user = i;
                    break;
                }
            }
            if (i == people.size()) {
                System.out.println("No Such Account Exists.\nTry Again..");
                System.out.print("Enter your account id :");
                id = s.next();
                return userID(id, people);
            } 
            else 
            return user;
        }
    }