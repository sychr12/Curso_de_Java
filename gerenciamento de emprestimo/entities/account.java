package entities;

public class account {
    
    private Integer numero;
    private String titular;
    protected Double balance;

    public account(){

    }

    public account(Integer numero, String titular, Double balance) {
        this.numero = numero;
        this.titular = titular;
        this.balance = balance;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getBalance() {
        return balance;
    }

    public void witdraw (double amount){
        balance -= amount + 5.0;
    }

    public void deposit(double amount){
        balance += amount;
    }

    
    
}
