package mx.uaemex.fi.paradigmas.figuras;

public class Rectangulo extends FIguraAbstracta {

    private double largo;
    private double ancho;

    public Rectangulo() {
        this.largo = 0.0;
        this.ancho = 0.0;
    }

    public Rectangulo(double l, double a) throws Exception {
        this.setLargo(l);
        this.setAncho(a);
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double l) throws Exception {
        if(l < 0){
            throw new Exception("El largo no puede ser negativo");
        }
        this.largo = l;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double a) throws Exception {
        if(a < 0){
            throw new Exception("El ancho no puede ser negativo");
        }
        this.ancho = a;
    }

    @Override
    public double perimetro() {
        return (2*this.largo + 2*this.ancho);
    }

    @Override
    public double area() {
        return this.largo * this.ancho;
    }

}
