// import java.util.Scanner;

// public class SimpleBankApp {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double balance = 400000.0;

//         System.out.println("---Simple Bank Application--");
//         System.out.println("1. Check balance");
//         System.out.println("2. Deposit balance");
//         System.out.println("3. Withdraw balance");
//         System.out.println("4. Exit");
//         System.out.println("Choose an Option");

//         int choice = sc.nextInt();

//         switch (choice) {
//             case 1:
//                 System.out.println("Your current balance is :"+balance);
//                 break;

//             case 2:
//              System.out.println("Enter amount to deposit:");
//              double deposit = sc.nextDouble();
//              if (deposit > 0) {
//                 balance += deposit;
//                 System.out.println("Deposited:"+deposit);
//                 System.out.println("New Balance:"+balance);   
//              }
//              else{
//                 System.out.println("Invalid amount! Deposit must be positive");
//              }
//              break;

//              case 3:
//              System.out.println("Enter amount to withdraw:");
//              double withdraw = sc.nextDouble();
//              if (withdraw > 0 &&  withdraw <= balance) {
//                 balance -= withdraw;
//                 System.out.println("Wihdrawed:"+ withdraw);
//                 System.out.println("New Balance:"+ balance);
                
//              }
//              else if (withdraw > balance) {
//                 System.out.println("Insuffiecient Balance");   
//              }
//              else{
//                 System.out.println("Withdrawl must be positive.");
//              }
//              break;

//              case 4:
//              System.out.println("Thank you for visiting simple bank application");
//              sc.close();
//              System.exit(0);
//              break;

//             default:
//             System.out.println("Invalid choice? Please select (1-4)");
//                 break;
//         }
//     }
    
// }

import java.util.Scanner;

public class SimpleBankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 400000.0; // Initial balance

        while (true) { // Keep the program running until user exits
            // Display menu
            System.out.println("\n--- Simple Bank Application ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an Option: ");

            int choice = sc.nextInt(); // Take user input

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposited: " + deposit);
                        System.out.println("New Balance: " + balance);
                    } else {
                        System.out.println("Invalid amount! Deposit must be positive.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawn: " + withdraw);
                        System.out.println("New Balance: " + balance);
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        System.out.println("Withdrawal must be positive.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Simple Bank Application. Goodbye!");
                    sc.close();
                    System.exit(0); // Exit program

                default:
                    System.out.println("Invalid choice! Please select 1-4.");
            }
        }
    }
}
