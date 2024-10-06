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
        
            balance -= amount;
            System.out.println("Amount successfully withdrawled, now the current balance is = "+ balance);
        
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("Amount deposited successfully , now the current balance is = "+balance);
    }

    void display() {
        System.out.println("Account no = " + account_number);
        System.out.println("Account holder name = " + name);
        System.out.println("Account type = " + account_name);
        System.out.println("Balance = " + balance);
    }
}

public class ques_5 {
    public static void main(String[] args) {
        Accounts obj = new Accounts(120, "Pranjal Tiwari", "Saving Account", 46000);
        obj.withdrawal(7600);
        obj.deposit(8800);
        obj.display();

    }
}
