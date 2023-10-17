package lesson1;

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Ting", 1500.76, 83109); 
        BankAccount account2 = new BankAccount("Bob", 21134.90, 2812372);
    
        /*  State of account1;
        accountHolder : "Ting"
        AccountBalance: "1500.76"
        Account number: "83109"
         */

         /*
          AccountHolder: "Bob"
          AccountBalance: "21134.90"
          AccountNum: "2812372"
          */

          account1.deposit(1000.30);

           /*  State of account1;
        accountHolder : "Ting"
        AccountBalance: "2501.26"
        Account number: "83109"
         */
    }


}
