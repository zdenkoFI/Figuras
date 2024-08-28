package mx.uaemex.fi.paradigmas.figuras;

public class Rombo extends FiguraConLadosIguales {

    private double dMen;
    private double dMay;

    public Rombo() throws Exception {
        super(0.0, 4);
        this.dMen = 0;
        this.dMay = 0;
    }

    public Rombo(double lado, int numLados, double dMen, double dMay) throws Exception {
        super(lado, numLados);
        this.dMen = dMen;
        this.dMay = dMay;
    }

    public double getdMen() {
        return dMen;
    }

    public void setdMen(double dMen) throws Exception {
        if (dMen < 0) {
            throw new Exception("La diagonal menor no puede ser negativa");
        }
        this.dMen = dMen;
    }

    public double getdMay() {
        return dMay;
    }

    public void setdMay(double dMay) throws Exception {
        if (dMay < 0) {
            throw new Exception("La diagonal mayor no puede ser negativa");
        }
        this.dMay = dMay;
    }

    @Override
    public double area() {
        return this.dMen * this.dMay/2;
    }
}
