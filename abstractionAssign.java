
import java.util.Scanner;
abstract class Shapes{
    abstract void Area();
}
class Circle extends Shapes{
    private float area;
    private float radius;
    public Circle(float radius){
        this.radius =radius;
    }
    public void Area(){
        area = (float)(3.142*radius*radius);
        System.out.println(area);
    }
}
class Rectangle extends Shapes{
    private float length;
    private float breadth;
    private float area;
    public Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void Area(){
        area = length*breadth;
        System.out.println(area);
    }
}
class Triangle{
    private float base;
    private float height;
    private float area;
    public Triangle(float height, float base){
        this.base = base;
        this.height = height;
    }
    public void Area(){
        area = (float)(base*height*0.5);
        System.out.println(area);
    }
}

public class abstractionAssign{
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        circle.Area();
        Rectangle rectangle = new Rectangle(5,5);
        rectangle.Area();
        Triangle triangle = new Triangle(4,4);
        triangle.Area();
    }
}