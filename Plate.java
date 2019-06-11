import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n, boolean x) {
        if (n <= food) {
            food -= n;
            x = true;
            System.out.println("После того как кот поел в тарелке сталось " + food + " корма");
            System.out.println("Сытость кота: " + x);
        } else {
            System.out.println("В тарелке не достаточно корма!");
            System.out.println("Сытость кота: " + x);
            //addfood(x);
        }
    }


    public void addfood(/*boolean y*/) {
        Scanner scanner = new Scanner(System.in);
        int a;
       /* if (y == false) {
            System.out.println("Введите сколько бы вам хотелось добавить корма: ");
            int a = scanner.nextInt();
            food += a;
            System.out.println("Теперь в тарелке: " + food + " корма");
        }*/
        //System.out.println("\nВведите сколько бы вам хотелось добавить корма: ");
        do {
            System.out.println("\nВведите сколько бы вам хотелось добавить корма: ");
            a = scanner.nextInt();
        } while (a <= 0);
        food += a;
        System.out.println("Теперь в тарелке: " + food + " корма");
    }

    public void info() {
        System.out.println("В тарелке: " + food + " корма");
    }
}
