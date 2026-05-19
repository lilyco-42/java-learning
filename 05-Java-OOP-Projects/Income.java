public class Income {
    public static void main(String[] args){
        int income = 140_000;
        String className = income > 120_000 ? "First" : "Economy";

        // if (income < 120_000){
        //     className = "Economy";
        // } else {
        //     className = "First";
        // }
        System.out.println(className);
    }
}
