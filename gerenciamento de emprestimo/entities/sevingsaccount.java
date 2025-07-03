package entities;

public class sevingsaccount extends account {

    private Double interesRate;

    public sevingsaccount(){
        super();

    }

    public sevingsaccount(Integer numero, String titular, Double balance, Double interesRate) {
        super(numero, titular, balance);
        this.interesRate = interesRate;
    }

    public Double getInteresRate() {
        return interesRate;
    }

    public void setInteresRate(Double interesRate) {
        this.interesRate = interesRate;
    }

    public void updatebalance(){
        balance += balance * interesRate;
    }

    @Override
    public void witdraw (double amount){
        balance -= amount;
    }

}
