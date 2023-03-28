package Java_Week8_Homework_SanketPatel.cylinder;

public class Cylinder extends Circle {
    double height;

    public Cylinder(double radius, double height){
        super(radius);
        this.height=height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }
}
