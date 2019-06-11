import java.util.Random;

/**
 * Java. Lesson7. My Homework7.
 *
 * @author Juliya
 * @version dated 11.06.2019
 */
public class Homework7 {
    public static void main(String[] args) {
        Random random = new Random();
        Plate plate = new Plate(50);

        Cat1[] cat1Array = new Cat1[5];
        cat1Array[0] = new Cat1("Барсик", random.nextInt(50));
        cat1Array[1] = new Cat1("Рыжик", random.nextInt(50));
        cat1Array[2] = new Cat1("Снежок", random.nextInt(50));
        cat1Array[3] = new Cat1("Яшка", random.nextInt(50));
        cat1Array[4] = new Cat1("Матроскин", random.nextInt(50));
        for (int i = 0; i < cat1Array.length; i++) {
            System.out.println(cat1Array[i]);
            plate.info();
            cat1Array[i].eat(plate);
        }
        plate.addfood();
    }
}
