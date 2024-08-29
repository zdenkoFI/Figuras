package mx.uaemex.fi.paradigmas.figuras;

public class Circulo extends FIguraAbstracta{

    private double radio;

    public Circulo() {
        this.radio = 0.0;
    }

    public Circulo(double r) throws Exception {
        this.setRadio(r);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double r) throws Exception {
        if(r < 0){
            throw new Exception("El radio no puede ser negativo");
        }
        this.radio = r;
    }

    @Override
    public double perimetro() {
        return Math.PI * radio*2;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(this.radio, 2);
    }

}
