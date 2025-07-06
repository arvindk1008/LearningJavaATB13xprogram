package Constructors;
class BankAccount {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }
}


public class PrivateAccessmodifier {
    public static void main(String[] args) {
        BankAccount acct = new BankAccount();
        System.out.println("Balance: " + acct.getBalance());
    }
}
