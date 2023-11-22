package application;

import model.entities.Account;
import model.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        try{
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = read.nextInt();
            read.nextLine();
            System.out.print("Holder: ");
            String holder = read.nextLine();
            System.out.print("Initial Balance: ");
            double balance = read.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = read.nextDouble();

            Account acc = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            acc.withdraw(read.nextDouble());

            System.out.println(acc);
            }catch (BusinessException be){
                System.out.println(be.getMessage());
            }catch (RuntimeException re){
                System.out.println("Erro inesperado");
            }
            read.close();
    }
}