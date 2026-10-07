import java.util.*;

class Pin {

    static int balance = 0;

    public static void main(String[] args) {
        bank();
    }

    public static void bank() {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("          WELCOME TO ATM            ");
        System.out.println("====================================");

        System.out.print("Enter Your PIN: ");
        int userpin = sc.nextInt();

        int pin = 1234;

        if (userpin == pin) {

            System.out.println("\n+----------------------------------+");
            System.out.println("|        LOGIN SUCCESSFUL          |");
            System.out.println("+----------------------------------+");

            while (true) {

                System.out.println("\n====================================");
                System.out.println("             ATM MENU               ");
                System.out.println("====================================");
                System.out.println("  1. Deposit Money");
                System.out.println("  2. Withdraw Money");
                System.out.println("  3. Check Balance");
                System.out.println("  4. Exit");
                System.out.println("====================================");

                System.out.print("What would you like to do next? : ");
                int choice = sc.nextInt();

                if (choice == 1) {

                    System.out.println("\n---------- DEPOSIT ----------");

                    System.out.print("Enter Deposit Amount: ");
                    int deposit = sc.nextInt();

                    if (deposit > 0) {
                        balance = balance + deposit;

                        System.out.println("--------------------------------");
                        System.out.println("Money Deposited Successfully!");
                        System.out.println("Deposited Amount : ₹" + deposit);
                        System.out.println("Current Balance  : ₹" + balance);
                        System.out.println("--------------------------------");
                    } else {
                        System.out.println("Invalid Amount!");
                    }

                } else if (choice == 2) {

                    System.out.println("\n---------- WITHDRAW ----------");

                    System.out.print("Enter Withdraw Amount: ");
                    int withdraw = sc.nextInt();

                    if (withdraw <= 0) {

                        System.out.println("Invalid Amount!");

                    } else if (withdraw > balance) {

                        System.out.println("--------------------------------");
                        System.out.println("Insufficient Balance!");
                        System.out.println("Current Balance : ₹" + balance);
                        System.out.println("--------------------------------");

                    } else {

                        balance = balance - withdraw;

                        System.out.println("--------------------------------");
                        System.out.println("Money Withdrawn Successfully!");
                        System.out.println("Withdrawn Amount : ₹" + withdraw);
                        System.out.println("Current Balance  : ₹" + balance);
                        System.out.println("--------------------------------");
                    }

                } else if (choice == 3) {

                    System.out.println("\n-------- CURRENT BALANCE --------");
                    System.out.println("Available Balance : ₹" + balance);
                    System.out.println("---------------------------------");

                } else if (choice == 4) {

                    System.out.println("\n====================================");
                    System.out.println("     THANK YOU FOR USING ATM        ");
                    System.out.println("       PLEASE VISIT AGAIN           ");
                    System.out.println("====================================");

                    break;

                } else {

                    System.out.println("\nInvalid Choice!");
                    System.out.println("Please select option 1, 2, 3 or 4.");

                }

                System.out.println("\n>>> You can perform another transaction.");
            }

        } else {

            System.out.println("\n====================================");
            System.out.println("          INCORRECT PIN             ");
            System.out.println("        ACCESS DENIED!              ");
            System.out.println("====================================");
        }

        sc.close();
    }
}