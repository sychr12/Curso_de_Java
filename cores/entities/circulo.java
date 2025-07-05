package entities;

public class circulo extends shape {

    private double raio;

    public circulo(){
        super();
    }

    

    public circulo(double raio) {
        this.raio = raio;
    }



    public circulo(entities.color color, double raio) {
        super(color);
        this.raio = raio;
    }

    


    @Override
    public double area() {
        return Math.PI * raio * raio;
    }



    public double getRaio() {
        return raio;
    }



    public void setRaio(double raio) {
        this.raio = raio;
    }

}
