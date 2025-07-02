package entities;

public class Main {
    private String holder;
    private double balance;

    public Main(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder(){
        return holder;
    }

    public void deposit(double amount){
        balance += amount;
    } 
    public void withdraw(double amount){
        balance -= amount;
    }
}
