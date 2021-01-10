
public class Loader
{
    public static void main(String[] args)
    {
        Cat.count = 0;
        while (Cat.count <= 3){
            Cat.count++;
            Cat cat = new Cat();
            if (cat.getStatus() == "Exploded" || cat.getStatus() == "Dead"){
                Cat.count = Cat.count - 1;
            }
        }
        System.out.print("Количество кошек равно " + Cat.getCount());

    }
}