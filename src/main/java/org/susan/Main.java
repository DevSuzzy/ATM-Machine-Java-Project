package org.susan;

import org.susan.AmtOperationServices.AtmOperationImp;
import org.susan.AmtOperationServices.AtmOperationInterf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperationInterf op = new AtmOperationImp();

        int atmnumber = 12345;
        int atmpin = 123;

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!!");
        System.out.println("Enter Atm Number : ");
        int atmNumber = in.nextInt();
        System.out.println("Enter Pin : ");
        int pin = in.nextInt();
        if ((atmnumber == atmNumber) && (atmpin == pin)) {

            while (true) {
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Mini Statement\n5.Exit :  ");
                System.out.println("Enter Choice : ");
                int choice = in.nextInt();
                if (choice == 1) {
                    op.viewBalance();

                } else if (choice == 2) {
                    System.out.println("Enter Amount to Withdraw ");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);


                } else if (choice == 3) {
                    System.out.println("Enter Amount to deposit : ");
                    double depositAmount = in.nextDouble();  // 5000
                    op.depositAmount(depositAmount);


                } else if (choice == 4) {
                    op.viewMiniStatement();

                }else if (choice == 5) {
                    System.out.println("Collect Your ATM card\n Thank you for using ATM Machine!!");
                    System.exit(0);

                }
                else {
                    System.out.println("please Enter Valid Choice");
                }
            }

        }
        else {
            System.out.println("Incorrect ATM number or PIN");
            System.exit(0);
        }
    }
}
