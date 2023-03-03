package uaslp.objetos;

import org.w3c.dom.css.Rect;

public class Rectangle extends Shape {
    private double base;
    private double height;

    public Rectangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    public String getName(){
        return "Rectangle";
    }
    public int getSidesCount(){
        return 4;
    }

    public double getArea(){
        return base*height;
    }

    public double getPerimeter(){
        return 2*base + 2*height;
    }
    public String toString() { return "█"; }
}
