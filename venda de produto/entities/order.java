package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import Status.status;

public class order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date data;
    private String status;

    private cliente cliente;
    private List<orderitem> items = new ArrayList<>();

    private order() {
    }

    public order(Date data, String status, entities.cliente cliente) {
        this.data = data;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void additems(orderitem item) {
        items.add(item);
    }

    public void removeitems(orderitem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (orderitem item : items) {
            sum += item.total();
        }
        return sum;
    }
        

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data");
        sb.append(sdf.format(data) + "\n");
        sb.append("Status");
        sb.append(status + "\n");
        sb.append("cliente ");
        sb.append(cliente + "\n");
        sb.append("Ordem dos items ");
        for (orderitem item : items) {
            sb.append(item + "\n");
        }

        sb.append("Total ");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

}
