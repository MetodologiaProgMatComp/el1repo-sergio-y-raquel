package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

public class Account {
    String Id;
    String name;
    int balance = 0;

    ///////////
    public Account(String id, String name) {
        Id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        Id = id;
        this.name = name;
        this.balance = balance;
    }
    ///////////

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
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another,int amount) {
        if (amount <= balance) {
            balance -= amount;
            int balanceAnother = another.getBalance();
            another.setBalance(balanceAnother + amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public String toString() {
        return "Account{" +
                "Id= " + Id +
                ", name= " + name +
                ", balance=" + balance +
                '}';
    }
}
