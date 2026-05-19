/*
 * Pentagon.java
 * Name: Markson Anietie Favour
 * MATRIC NO: 230905
 * This is the class for pentagon
 * it inherits from the abstract class Shape
 * it contains the methods for calculating the area and perimeter of a pentagon
 * it also contains the toString method for converting the object to string
 * it also contains the finalize method
 */
public class Pentagon extends Shape{
    private double side;

    public Pentagon(double side){
        super();
        this.side = side;
    }

    public double area(){
        return 1.720477401 * side * side;
    }

    public double perimeter(){
        return 5 * side;
    }

    // convert to string
    public String toString(){
        return "Pentagon with side " + side;
    }

    // Finalize the object
    protected void finalize(){
        super.finalize();
    }
}