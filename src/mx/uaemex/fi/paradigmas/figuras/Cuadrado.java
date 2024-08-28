package mx.uaemex.fi.paradigmas.figuras;

public class Cuadrado extends FiguraConLadosIguales {

    public Cuadrado() throws Exception {
        super(0.0, 4);
    }

    public Cuadrado(double lado) throws Exception {
        super(lado, 4);
    }

    @Override
    public double area() {
        return this.lado * this.lado;
    }
}
