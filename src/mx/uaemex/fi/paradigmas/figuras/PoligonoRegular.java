package mx.uaemex.fi.paradigmas.figuras;

public class PoligonoRegular extends FiguraConLadosIguales{

    private double apotema;

    public PoligonoRegular() {
        super();
        this.apotema = 0.0;
    }

    public PoligonoRegular(double lado, int numLados, double apotema) throws Exception {
        super(lado, numLados);
        this.setApotema(apotema);
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apo) throws Exception {
        if(apo < 0){
            throw new Exception("La apotema no puede ser negativa");
        }
        this.apotema = apo;
    }

    @Override
    public double area() {
        return this.perimetro()*this.apotema/2;
    }
}
