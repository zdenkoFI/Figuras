package mx.uaemex.fi.paradigmas.figuras;

public class Main {
    public static void main(String[] args) throws Exception {

        //Se puede probar con cada figura, en este caso decidí realizar la prueba con un círculo y trapecio

    Figura f1 = new Circulo(10.0); // a1= 314.1592
    Figura f2 = new Trapecio(2.0, 3.5, 5.0, 5.0); // a2=18.75

    int result = f1.compareTo(f2); // a1 > a2

        System.out.println("Área Círculo: " + f1.area());
        System.out.println("Área Trapecio: " + f2.area());
        System.out.println(result); // r=1
        
    }
}