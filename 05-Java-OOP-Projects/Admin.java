public class Admin {
    public static void main(String[] args){
        String role = "favour";

        switch (role){
            case "admin":
            System.out.println("This user is an admin");
            break;

            case "moderator":
            System.out.println("This user is a moderator");
            break;

            default:
            System.out.println("This user is a guest");
            break;
        }
    }
}
