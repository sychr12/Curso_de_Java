package entities;


public class Employee {
    
    private String name;
    private Integer horas;
    private Double pagametoporhora;

    public Employee(){
    }

    public Employee(String name, Integer horas, Double pagametoporhora) {
        this.name = name;
        this.horas = horas;
        this.pagametoporhora = pagametoporhora;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getPagametoporhora() {
        return pagametoporhora;
    }

    public void setPagametoporhora(Double pagametoporhora) {
        this.pagametoporhora = pagametoporhora;
    }

    public double pagamento(){
        return horas * pagametoporhora;
    }
}
