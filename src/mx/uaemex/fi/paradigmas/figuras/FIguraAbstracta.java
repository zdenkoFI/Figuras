package mx.uaemex.fi.paradigmas.figuras;

public abstract class FIguraAbstracta implements Figura {

    public int compareTo(Object o){
        Figura f = (Figura) o;

        double a1 = this.area();
        double a2 = f.area();

        if(a1 > a2){
            return 1;
        }
        else if(a1 < a2){
            return -1;
        }
        if(a1 == a2){
            return 0;
        }
        return 0;
    }
}
