package com.problem_4.problem_statement_4_1;

import java.util.Scanner;

public class TestBank {
  public static void main(String[] args) {
    BankAccount b1 = null,b2 = null;
    
//    details for Saving account
    try {
      b1 = new BankAccount(1221, "Bhushan More", "Savings", 1200);
    } catch (NegativeBalanceException | LowBalanceException e) {
      e.printStackTrace();
    }
    
//    details for Current Account
    try {
      b2 = new BankAccount(1331, "Bhushan More", "Current", 7000);
    } catch (NegativeBalanceException | LowBalanceException e) {
      e.printStackTrace();
    }

//    Here we Run the method for both the objects
    runBank(b1);
    runBank(b2);
  }
  
//  this method manipulate the object's data
  public static void runBank(BankAccount bk)
  {
    BankAccount b = bk;
    System.out.println("This method is Running For");
    System.out.println(b+"\n");
    
    boolean check=true;
    while(check)
    {
      System.out.println("1)withdraw\n2)deposit\n3)getBalance\n4)Exit");
      System.out.println("Enter your choice : ");
      switch(new Scanner(System.in).nextInt())
      {
        case 1:
          System.out.println("Enter Amount to withdraw : ");
          try {
            b.withdraw(new Scanner(System.in).nextFloat());
          } catch (InsuficientFundsException e2) {
            System.out.println(e2.getMessage());
          }
          break;
          
        case 2:
          System.out.println("Enter Amount to Deposite : ");
          try {
            b.deposit(new Scanner(System.in).nextFloat());
          } catch (NegativeAmountException e1) {
            System.out.println(e1.getMessage());
          }
          break;
          
        case 3:
          try {
            System.out.println(b.getBalance());
          } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
          }
          break;
          
        case 4:check = false;
            break;
        default:
          System.out.println("Invalid Choice");
          break;
      }
    }
  }
}