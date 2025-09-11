package Retangulo;

public class Retangulo {
    double width;
    double heigth;

    public double Area(){
        return (width * heigth)  / 2;
    }

    public double Perimeter(){
        return width + heigth + Diagonal();
    }

    public double Diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(heigth, 2));
    }

    public String toString(){
        return "Area: " + Area() +  "\nPerimeter: " + Perimeter() +  "\nDIAGONAL: " + Diagonal();
    }
}
