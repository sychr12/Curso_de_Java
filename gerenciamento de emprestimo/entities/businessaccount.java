package entities;

public class businessaccount extends account {
    private Double loanLimit;

    public businessaccount() {
        super();

    }

    public businessaccount(Integer numero, String titular, Double balance, Double loanLimit) {
        super(numero, titular, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }

    @Override
    public void witdraw(double amount) {
        super.witdraw(amount);
        balance -= 2.0;
    }

}
