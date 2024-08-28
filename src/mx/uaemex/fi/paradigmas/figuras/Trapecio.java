package mx.uaemex.fi.paradigmas.figuras;

public class Trapecio extends Figura {

    private double baseMenor;
    private double baseMayor;
    private double lado;
    private double altura;

    public Trapecio() {
        this.baseMenor = 0;
        this.baseMayor = 0;
        this.lado = 0;
        this.altura = 0;
    }

    public Trapecio(double bMen, double bMay, double l, double alt) throws Exception {
        this.setBaseMenor(bMen);
        this.setBaseMayor(bMay);
        this.setLado(l);
        this.setAltura(alt);
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double bMen) throws Exception {
        if(bMen < 0){
            throw new Exception("La base menor no puede ser negativa");
        }
        this.baseMenor = bMen;
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double bMay) throws Exception {
        if(bMay < 0){
            throw new Exception("La base mayor no puede ser negativa");
        }
        this.baseMayor = bMay;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double l) throws Exception {
        if(l < 0){
            throw new Exception("El lado no puede ser negativo");
        }
        this.lado = l;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double alt) throws Exception {
        if(alt < 0){
            throw new Exception("La altura no puede ser negativa");
        }
        this.altura = alt;
    }

    @Override
    public double perimetro() {
        return (this.baseMenor + this.baseMayor + 2*this.lado);
    }

    @Override
    public double area() {
        return (this.baseMenor + this.baseMayor/2)*this.altura;
    }
}
