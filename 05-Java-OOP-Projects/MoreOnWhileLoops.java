import java.util.Scanner;

public class MoreOnWhileLoops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true){
            System.out.print("Input: ");
            input = scanner.next();
            if (input.equals("pass")){
                continue;
            }
            if (input.equals("quit")){
                break;
            }
            System.out.println(input);
        }
        scanner.close();
    }
}


// import java.util.Scanner;

// public class MoreOnWhileLoops {
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         String input = "";
//         while (!(input.equals("quit"))){
//             System.out.print("Input: ");
//             input = scanner.next();
//             System.out.println(input);
//         }
//         scanner.close();
//     }
// }
