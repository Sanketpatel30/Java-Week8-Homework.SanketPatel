package Java_Week8_Homework_SanketPatel.cylinder;
import javax.swing.*;
public class Circle {
    double radius;

    public Circle(double radius){
        this.radius = radius < 0 ? 0 : radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
