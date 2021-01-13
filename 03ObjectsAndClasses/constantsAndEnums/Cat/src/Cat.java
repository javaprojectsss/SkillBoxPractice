
public class Cat
{
    private double originWeight;
    private double weight;

    public static final int EYES_COUNT = 2;
    public static final double MAXIMAL_WEIGHT = 9000.0;
    public static final double MINIMAL_WEIGHT = 1000.0;


    public void catCollour(CatCollours collur){}

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;

    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < MINIMAL_WEIGHT) {
            return "Dead";
        }
        else if(weight > MAXIMAL_WEIGHT) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}
