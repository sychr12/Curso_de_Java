package entities;


public class OutsourcedEmployee extends Employee {

    private double additionalcharge;
    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(String name, Integer horas, Double pagametoporhora, double additionalcharge) {
        super(name, horas, pagametoporhora);
        this.additionalcharge = additionalcharge;
    }

    public double getAdditionalcharge() {
        return additionalcharge;
    }

    public void setAdditionalcharge(double additionalcharge) {
        this.additionalcharge = additionalcharge;
    }

    @Override
    public double pagamento(){
        return super.pagamento() + additionalcharge * 1.1;
    }
}