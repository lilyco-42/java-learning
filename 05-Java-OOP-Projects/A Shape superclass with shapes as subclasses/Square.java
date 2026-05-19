/*
 * Square.java
 * Name: Markson Anietie Favour
 * MATRIC NO: 230905
 * This is the class for square
 * it inherits from the abstract class Shape
 * it contains the methods for calculating the area and perimeter of a square
 * it also contains the toString method for converting the object to string
 * it also contains the finalize method
 */
public class Square extends Shape{
    private double side;

    public Square(double side){
        super();
        this.side = side;
    }

    public double area(){
        return side * side;
    }

    public double perimeter(){
        return 4 * side;
    }

    // convert to string
    public String toString(){
        return "Square with side " + side;
    }

    // Finalize the object
    protected void finalize(){
        super.finalize();
    }
}