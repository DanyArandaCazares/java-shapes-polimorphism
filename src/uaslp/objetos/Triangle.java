package uaslp.objetos;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    public String getName(){
        return "Triangle";
    }
    public int getSidesCount(){
        return 3;
    }
    public double getArea(){
        return (base*height)/2;
    }
    public double getPerimeter(){
        return base*3;
    }
    public String toString() { return "▲"; }
}
