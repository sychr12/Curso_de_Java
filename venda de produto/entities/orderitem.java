package entities;

public class orderitem {
    

    private int quantidade;
    private Double preco;

    private produto produto;

    public orderitem(){
    }

    

    public orderitem(int quantidade, Double preco, entities.produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getpreco() {
        return preco;
    }

    public void setpreco(Double preco) {
        this.preco = preco;
    }



    public produto getProduto() {
        return produto;
    }



    public void setProduto(produto produto) {
        this.produto = produto;
    }

    public double total() {
		return preco * quantidade;
	}

    public String toString(){
        return produto.nomepd() + "$" + String.format("%.2f", preco) + "quantidade" + quantidade + "Subtotal: $" + String.format("%.2f", total());
    }

    
}
