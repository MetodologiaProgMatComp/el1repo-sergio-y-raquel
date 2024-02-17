package es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_5;

import java.text.DecimalFormat;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    ////////////////////////////////////////////////////
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }
    ////////////////////////////////////////////////

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return String.format("id=%s Customer=%s balance=$%s",id, customer, df.format(balance));
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return this;
    }

    public Account withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}
