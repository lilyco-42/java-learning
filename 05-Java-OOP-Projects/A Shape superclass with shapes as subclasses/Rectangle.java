/*
 * Rectangle.java
 * Name: Markson Anietie Favour
 * MATRIC NO: 230905
 * This is the class for rectangle
 * it inherits from the abstract class Shape
 * it contains the methods for calculating the area and perimeter of a rectangle
 * it also contains the toString method for converting the object to string
 * it also contains the finalize method
 */
public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        super();
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length * width;
    }

    public double perimeter(){
        return 2 * (length + width);
    }

    // convert to string
    public String toString(){
        return "Rectangle with length " + length + " and width " + width;
    }

    // Finalize the object
    protected void finalize(){
        super.finalize();
    }
}