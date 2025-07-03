package entities;

public class produto {
    

    private String nomepd;
    private Double preco;

    public produto(){

    }

    public produto(String nome, Double preco) {
        this.nomepd = nome;
        this.preco = preco;
    }

    public String nomepd() {
        return nomepd;
    }

    public void setnomepd(String nome) {
        this.nomepd = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    
}
