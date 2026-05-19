package day36._03_Abstract;

public class GreekSalad extends Salad {
    @Override
    public String madeIn() {
        return "Greece";
    }

    @Override
    public String taste() {
        return "fresh, tangy, olive-oil";
    }
}
