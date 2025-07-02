package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


import Status.cargo;

public class work {
    private String name;
    private cargo cargo;
    private Double salario;

    private departamento departamento;
    private List<Horadecontrato> contracts = new ArrayList<>();

    public work(){
        
    }

    public work(String name, Status.cargo cargo, Double salario, entities.departamento departamento) {
        this.name = name;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCargo(cargo cargo) {
        this.cargo = cargo;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setDepartamento(departamento departamento) {
        this.departamento = departamento;
    }

    public void addContract(Horadecontrato contract){
        contracts.add(contract);
    }

    public void removecontracts(Horadecontrato contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double sum = salario;
        Calendar cal = Calendar.getInstance();
        for(Horadecontrato c : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if(year == c_year && month == c_month){
                sum += c.totalValue();
            }

        }
        return sum;



    }

    public String getName() {
        return name;
    }

    public departamento getDepartamento() {
        return departamento;
    }
}
