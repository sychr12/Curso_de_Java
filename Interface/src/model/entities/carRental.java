package model.entities;

import java.time.LocalDateTime;

public class carRental {

    private LocalDateTime start;
    private LocalDateTime finish;

    private Veiculo veiculo;
    private Invoice invoice;

    public carRental() {
    }

    public carRental(LocalDateTime start, LocalDateTime finish, Veiculo veiculo) {
        super();
        this.start = start;
        this.finish = finish;
        this.veiculo = veiculo;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
