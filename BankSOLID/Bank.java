package BankSOLID;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Bank {

    public static void main(String[] args) {

        menu();
        {
            char option;
            String name = JOptionPane.showInputDialog(null, "Digite seu nome.");
            String customerId = JOptionPane.showInputDialog(null, "Digite seu ID.");
            Account client1 = new Account(name, customerId);
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Welcome " + client1.name);
                System.out.println("Your ID:" + client1.customerId);
                System.out.println("\n");
                System.out.println("a) Check Balance");
                System.out.println("b) Deposit Amount");
                System.out.println("c) Withdraw Amount");
                System.out.println("d) Previous Transaction");
                System.out.println("e) Exit");

                do {
                    System.out.println("********************************************");
                    System.out.println("Choose an option");
                    option = sc.next().charAt(0);
                    System.out.println("\n");

                    switch (option) {

                        case 'a':
                            System.out.println("......................");
                            System.out.println("Balance =" + client1.bal);
                            System.out.println("......................");
                            System.out.println("\n");
                            break;
                        case 'b':
                            System.out.println("......................");
                            System.out.println("Enter a amount to deposit :");
                            System.out.println("......................");
                            double amt = sc.nextDouble();
                            client1.deposit(amt);
                            System.out.println("\n");
                            break;
                        case 'c':
                            System.out.println("......................");
                            System.out.println("Enter a amount to Withdraw :");
                            System.out.println("......................");
                            double amtW = sc.nextDouble();
                            client1.withdraw(amtW);
                            System.out.println("\n");
                            break;
                        case 'd':
                            System.out.println("......................");
                            System.out.println("Previous Transaction:");
                            client1.getPreviousTrans();
                            System.out.println("......................");
                            System.out.println("\n");
                            break;

                        case 'e':
                            System.out.println("......................");
                            break;
                        default:
                            System.out.println("Choose a correct option to proceed");
                            break;
                    }

                } while (option != 'e');
            }
            System.out.println("Thank you for using our banking services");

        }
    }

    private static void menu() {
    }
}