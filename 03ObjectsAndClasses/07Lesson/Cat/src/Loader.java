
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat("Мурка", 1500.0 + 3000.0 * Math.random(), "");
        Cat copyCat = new Cat(cat);
        System.out.println(cat.getName() + copyCat.getName() + cat.getWeight() + " " + copyCat.getWeight() + " " + cat.getStatus() + copyCat.getStatus());
    }
}