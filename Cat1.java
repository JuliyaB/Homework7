public class Cat1 {
    private String name;
    private int appetite;
    boolean satiety = false;

    public Cat1(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite, satiety);
    }

    public String toString() {
        return "\nКот по имени " + name + " имеет аппетит: " + appetite;
    }
}
