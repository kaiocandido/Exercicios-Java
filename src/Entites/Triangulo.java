package Entites;

public class Triangulo {
    public double a;
    public double b;
    public double c;

    public  double Area(){
        double p;
        double areaFinal;
        p = (a + b + c ) / 2.0;
        areaFinal = Math.sqrt((p * (p - a) * (p - b) * ( p -c )));

        return areaFinal;
    }
}
