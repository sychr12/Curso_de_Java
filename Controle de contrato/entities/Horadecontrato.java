package entities;

import java.util.Date;

public class Horadecontrato {
    
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public Horadecontrato(){
        
    }

    public Horadecontrato(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue(){
        return valuePerHour * hours;
    }

    public Date getDate() {
        return date;
    }
}
