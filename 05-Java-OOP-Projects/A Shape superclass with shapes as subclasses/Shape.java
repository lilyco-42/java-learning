/*
 * Shape.java
 * This is the abstract class for all shapes
 * the abstract class is used to define the common properties
 *  and methods of all shapes
 * It also contains a static variable to count the number of shapes created
 * 
 * 
 */

public abstract class Shape{
    private static int count = 0;

    public Shape(){
        count++;
    }

    // Calculate area of the shape
    public abstract double area();

    // Calculate perimeter of the shape
    public abstract double perimeter();

    // Get the number of shapes created
    public static int getCount(){
        return count;
    }
    
    // Finalize the object
    protected void finalize(){
        count--;
    }
}
