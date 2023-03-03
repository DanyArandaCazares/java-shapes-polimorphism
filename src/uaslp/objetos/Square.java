package uaslp.objetos;

public class Square extends Shape {
    private double side;

    public Square(int side){
        this.side = side;
    }

    public String getName(){
        return "Square";
    }
    public int getSidesCount() {
        return 4;
    }
    public double getArea() {
        return side*side;
    }
    public double getPerimeter(){
        return side*4;
    }
    public String toString() { return "■"; }
}
