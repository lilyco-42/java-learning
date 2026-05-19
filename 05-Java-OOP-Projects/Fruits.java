import java.util.Scanner;
public class Fruits {
    public static void main(String[] args){
        String[] fruits = {"Apple", "Orange", "Banana"};
        for (int i = fruits.length - 1; i > 0; i--){
            System.out.println(fruits[i]);
        }

        // for (String fruit: fruits){
        //     System.out.println(fruit);
        // }
    }
}
