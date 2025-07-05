package entities;

public class retangulo extends shape {

    private double largura;
    private double altura;

    public retangulo(){
        super();
    }

    

    public retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    



    public double getLargura() {
        return largura;
    }



    public void setLargura(double largura) {
        this.largura = largura;
    }



    public double getAltura() {
        return altura;
    }



    public void setAltura(double altura) {
        this.altura = altura;
    }



    public retangulo(entities.color color, double largura, double altura) {
        super(color);
        this.largura = largura;
        this.altura = altura;
    }



    @Override
    public double area() {
      return largura * altura;
    }

}
