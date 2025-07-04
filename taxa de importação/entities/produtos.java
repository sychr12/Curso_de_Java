package entities;







public class produtos {

    private String name;
    private double preco;


    public produtos(){

    }

    public produtos(String name, double preco) {
        this.name = name;
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String precoTag(){
        return name + " $ " + String.format("%.2f", preco);
        
    }

    

}
