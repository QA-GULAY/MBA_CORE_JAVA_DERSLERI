package Day_35.Package;

public class BankAccount {
    private double balance;

    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
        }
    }
    public void withdraw(double amount){
        if (amount>0 &&amount<=balance){
            balance-=amount;
        }
    }
}
