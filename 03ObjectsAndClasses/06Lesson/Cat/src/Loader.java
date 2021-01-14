import java.util.Scanner;

public class Loader
{
    public static void main(String[] args)
    {

        getKitten();
        getKitten();
        getKitten();

    }

    private static Cat getKitten() {
        System.out.println("Задайте вес кошке");
        Cat cat = new Cat(0.0);
        Scanner scanner = new Scanner(System.in);
        cat.getCmdWeight();
        System.out.println("Вес вашей кошки: " + Cat.cmdWeight);
        return cat;

    }

}