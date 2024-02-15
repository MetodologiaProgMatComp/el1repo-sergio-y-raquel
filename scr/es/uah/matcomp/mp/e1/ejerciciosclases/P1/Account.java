package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

public class Account {
    String Id;
    String name;
    int balance = 0;

    public void account(String Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    public void account(String Id, String name, int balance) {
        this.Id = Id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exeeded balance");
        }
        return balance;
    }

    public int transferTo(Account another,int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.setBalance(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public String toString() {
        return "Account{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
