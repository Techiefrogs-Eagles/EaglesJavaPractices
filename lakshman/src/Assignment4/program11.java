package Assignment4;

public class program11 {}

class cylinder extends circle
{
    double height = 1.0;

    cylinder(){}

    cylinder(double radius){}

    cylinder(double radius , String colour){}

    cylinder(double radius , double height , String colour){}

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return 1.1;
    }

    public double getArea() {
        return (2*3.14*radius*height);
    }
}

class circle
{
    double radius = 1.0;
    String colour = "red";

    circle(){}

    circle(double radius){}

    circle(double radius , String colour){}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getArea() {
        return (23.14*radius);
    }

    public String toString(String colour) {
        return "circle[radius=r,colour=c]";
    }

}