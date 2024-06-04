package OOP;

public class Aquatic extends Animal {
    private String name;

    @Override
    String move() {

        return "moves by swimming";
    }

    public static void main(String[] args) {
        Aquatic fish = new Aquatic();
        fish.name = "whale";
        System.out.println("\n" + fish.name + " " + fish.move());
    }
}