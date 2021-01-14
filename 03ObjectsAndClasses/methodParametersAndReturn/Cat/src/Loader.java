import java.util.Scanner;

public class Loader {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        Cat catname1 = new Cat();
        System.out.println(catname1.randomName() + " весил" + catname1.isaArtical() + " " + catname1.getWeight());

        System.out.println("Введите число корма ");
        catname1.feed((int) scanner.nextInt());

        System.out.println("Введите число корма ещё раз ");
        catname1.feed((int) scanner1.nextInt());

        System.out.println(catname1.randomName() + " Поел" + catname1.isaArtical() + " и стал" + catname1.isaArtical() + " весить " + catname1.getWeight());
        catname1.pee
    }
}
