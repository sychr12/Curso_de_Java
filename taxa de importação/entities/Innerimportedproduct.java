package entities;

public class Innerimportedproduct extends produtos {

    private Double cusnt;

    public Innerimportedproduct(String name, double preco, Double cusnt) {
        super(name, preco);
        this.cusnt = cusnt;
    }

    public Double getCusnt() {
        return cusnt;
    }

    public void setCusnt(Double cusnt) {
        this.cusnt = cusnt;
    }

    public Double totalpreco() {
        return getPreco() + cusnt;
    }

    @Override
    public String precoTag() {
        return getName() + " $ " + String.format("%.2f", totalpreco()) + " (Customs fee: $ "
                + String.format("%.2f", cusnt) + ")";
    }

}
