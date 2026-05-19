/*
 * TestShape.java
 * Driver class for the Shape hierarchy
 * Start with this file and modify it to test your code
 */
public class TestShape{
    public static void main(String[] args){
        // create an array of shapes
        Shape[] shapes = new Shape[5];

        // create the shapes
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(2, 1);
        shapes[2] = new Square(2);
        shapes[3] = new Triangle(2, 2, 2);
        shapes[4] = new Pentagon(2);


        // print out the number of shapes
        System.out.println(shapes[0].getCount() + " shapes created");
        // print the shapes
        for(int i = 0; i < shapes.length; i++){
            System.out.println("\n" + shapes[i].toString());
            System.out.println("Area: " + shapes[i].area());
            System.out.println("Perimeter: " + shapes[i].perimeter());
        }
    }
}