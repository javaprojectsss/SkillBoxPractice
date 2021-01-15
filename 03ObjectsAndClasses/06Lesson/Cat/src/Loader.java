public class Loader
{
    public static void main(String[] args)
    {

        getKitten();
        getKitten();
        getKitten();

    }

    private static Cat getKitten() {
        Cat cat = new Cat(1100.0);
        System.out.println("Вес вашей кошки: " + cat.getCmdWeight());
        return cat;

    }

}
