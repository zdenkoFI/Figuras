package mx.uaemex.fi.paradigmas.figuras;

public abstract class FiguraConLadosIguales extends Figura{

    protected double lado;
    protected int numLados;

    public FiguraConLadosIguales() {
        super();
        this.lado = 0;
        this.numLados = 0;
    }

    public FiguraConLadosIguales(double lado, int numLados) throws Exception {
        this.setLado(lado);
        this.setNumLados(numLados);
    }

    @Override
    public double perimetro() {
        return this.lado + this.numLados*this.lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) throws Exception {
        if(lado < 0){
            throw new Exception("Los lados no pueden ser negativos");
        }
        this.lado = lado;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) throws Exception {
        if(numLados < 0){
            throw new Exception("El número de lados no puede ser negativo");
        }
        this.numLados = numLados;
    }

}
