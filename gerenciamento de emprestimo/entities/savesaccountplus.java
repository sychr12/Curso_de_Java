package entities;

public class savesaccountplus extends sevingsaccount {

    @Override
    public void witdraw(double amount) {
        balance -= amount + 2;
    }
}
