
public class Loader
{
    public static void main(String[] args) {


        Cat cat = new Cat();
        System.out.println("1 Кошка весит: " + cat.getWeight());
        Cat cat1 = new Cat();
        System.out.println("2 Кошка весит: " + cat1.getWeight());
        Cat cat2 = new Cat();
        System.out.println("3 Кошка весит: " + cat2.getWeight());
        Cat cat3 = new Cat();
        System.out.println("4 Кошка весит: " + cat3.getWeight());
        Cat cat4 = new Cat();
        System.out.println("5 Кошка весит: " + cat4.getWeight());

        cat.feed(500.0);
        System.out.println("1 Кошка поела, стала весить " + cat.getWeight() + " и она " + cat.getStatus());
        cat1.feed(9000.0);
        System.out.println("2 Кошка поела и она " + cat1.getStatus());
        System.out.println("3 Кошка мяукнула и стала весить: " + cat2.getWeight());

        if (cat2.getWeight() != cat2.getMinWeight()) {
            for (; cat2.getWeight() > cat2.getMinWeight(); cat2.meow()) {
                System.out.println("Кошка опять мяукнула и стала весить: " + cat2.getWeight());
            }
        }
        if (cat2.getWeight() <= cat2.getMinWeight()){
            System.out.println(cat2.getStatus());
        }
    }
}