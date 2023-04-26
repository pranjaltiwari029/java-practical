// WAP that creates a class Accounts with following details:Instance variables: ac_no., name, ac_name,
// balance .Methods: withdrawal(), deposit(),display().Use constructors to initialize members.

class Accounts {
    long account_number;
    String name;
    String account_name;
    double balance;

    Accounts(long account_number, String name, String account_name, double balance) {
        this.account_number = account_number;
        this.name = name;
        this.account_name = account_name;
        this.balance = balance;
    }

    void withdrawal(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Successfull withdrawl");
        }
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("Added Successfully");
    }

    void display() {
        System.out.println("Account no: " + account_number);
        System.out.println("Account holder name: " + name);
        System.out.println("Account type: " + account_name);
        System.out.println("Balance: " + balance);
    }
}

public class ques5 {
    public static void main(String[] args) {
        Accounts obj = new Accounts(076, "Pranjal", "Current", 120000);
        obj.withdrawal(12000);
        obj.deposit(4000);
        obj.display();

    }
}
