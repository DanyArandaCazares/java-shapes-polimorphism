package uaslp.objetos;

public class Circle extends Shape {
    private double radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public String getName(){
        return "Circle";
    }
    public int getSidesCount(){
        return 1;
    }
    public double getArea(){
        return 3.1416*(radius*radius);
    }
    public double getPerimeter() { return 2*3.1416*radius; }
    public String toString() { return  "○"; }
}
