package mx.uaemex.fi.paradigmas.figuras;

public interface Figura extends Comparable {

    double perimetro();
    double area();

    @Override
    int compareTo(Object o);
}
