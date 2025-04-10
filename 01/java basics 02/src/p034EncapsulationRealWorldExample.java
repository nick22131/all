  class BankAccount{
    private double balance;

    public BankAccount(double balance){
        if(balance >= 0){
            this.balance = balance;
        }
        else{
            System.out.println("Initial Balance cannot be negative ");
        }
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount ;
            System.out.println("Deposited : $" + amount);
        }
        else{
            System.out.println("Deposited amount must be positive");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance ){
            balance = balance - amount;
            System.out.println("withdrawn: $" + amount);
        }
        else{
            System.out.println("Insufficient funds Or Invalid Amount ");
        }
    }
  }

public class p034EncapsulationRealWorldExample {
    public static void main(String[] args){
    BankAccount acc = new BankAccount(1000);
    acc.deposit(500);
    acc.withdraw(200);

    System.out.println("Current Balance: $"  + acc.getBalance());
    }
}
