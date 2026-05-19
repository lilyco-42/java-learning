/*
 * Triangle.java
 * Name: Markson Anietie Favour
 * MATRIC NO: 230905
 * This is the class for triangle
 * it inherits from the abstract class Shape
 * it contains the methods for calculating the area and perimeter of a triangle
 * it also contains the toString method for converting the object to string
 * it also contains the finalize method
 */
public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area(){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double perimeter(){
        return side1 + side2 + side3;
    }

    // convert to string
    public String toString(){
        return "Triangle with sides " + side1 + ", " + side2 + " and " + side3;
    }

    // Finalize the object
    protected void finalize(){
        super.finalize();
    }
}