package OOP;

public class Bank {

    String accHolder;
    double balance;

    Bank(String accHolder,double balance){
        this.accHolder = accHolder;
        this.balance = balance;
    }

    void deposit(double amount){
        balance += amount;
        System.out.println(amount + " is deposited, new balance is "+balance);
    }

    void withdraw(double amount){
        if (amount>balance){
            System.out.println("insufficient balance");
        }
        else {
            balance -= amount;
            System.out.println(amount+" is withdrawn, new balance is "+ balance);
        }
    }

    void displayDetails(){
        System.out.println("Holder name- "+accHolder);
        System.out.println("Available balace- "+balance);
    }

    void displayBalance(){
        System.out.println("Available balace- "+balance);
    }

    public static void main(String[] args) {

        Bank user1 = new Bank("aakash", 100);

        user1.displayDetails();
        user1.deposit(400);
        user1.displayBalance();
        user1.withdraw(500);
        user1.displayBalance();
    }
}
