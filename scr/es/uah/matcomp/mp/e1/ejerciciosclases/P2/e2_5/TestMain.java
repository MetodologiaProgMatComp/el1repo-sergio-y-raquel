package es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_5;

public class TestMain {
    public static void main(String[] args) {
        Customer c1 = new Customer(2, "Felipe", 'm');
        System.out.println(c1+"\n"+c1.getId()+"\n"+c1.getName()+"\n"+c1.getGender()+"\n");
        Account a1 = new Account(1, c1, 2000.796864);
        System.out.println(a1+"\n"+a1.getId()+"\n"+a1.getCustomer()+"\n"+a1.getBalance()+"\n"+a1.getCustomerName()+"\n");
        a1.setBalance(1000.4641306);
        System.out.println(a1+"\n"+a1.getBalance()+"\n");
        a1.deposit(-5.8454);
        a1.deposit(10.654488);
        System.out.println(a1+"\n"+a1.getBalance()+"\n");
        a1.withdraw(-5.8454);
        a1.withdraw(45688749);
        a1.withdraw(10.654488);
        System.out.println(a1+"\n"+a1.getBalance());
    }
}
