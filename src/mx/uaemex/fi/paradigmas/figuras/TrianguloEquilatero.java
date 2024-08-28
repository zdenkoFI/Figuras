package mx.uaemex.fi.paradigmas.figuras;

public class TrianguloEquilatero extends FiguraConLadosIguales{

    public TrianguloEquilatero() throws Exception {
        super(0.0, 3);
    }

    public TrianguloEquilatero(double lado) throws Exception {
        super(lado, 3);
    }

    @Override
    public double area() {
        double altura;
        altura = this.lado*Math.cos(Math.toRadians(30));
        return this.lado*altura/2;
    }
}
