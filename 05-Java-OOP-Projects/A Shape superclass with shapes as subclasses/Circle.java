/*
 * Circle.java
 * Name: Markson Anietie Favour
 * MATRIC NO: 230905
 * This is the class for circle
 * it inherits from the abstract class Shape
 * it contains the methods for calculating the area and perimeter of a circle
 * it also contains the toString method for converting the object to string
 * it also contains the finalize method
 */
public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    // convert to string
    public String toString(){
        return "Circle with radius " + radius;
    }

    // Finalize the object
    protected void finalize(){
        super.finalize();
    }
}

