
public class Cat
{
    private  double weight;

    double minWeight = 1000.0;
    double maxWeight = 9000.0;
    private double originWeight;

    private  String name;
    private  String status = getStatus();

    public Cat(String name, Double weight, String status)
    {
        this.weight = weight;
        this.name = name;
        this.status = status;
        originWeight = weight;
    }

    public Cat(Cat copy)
    {

        this(copy.getName(), copy.getWeight(), copy.getStatus());

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

    public  Double getWeight()
    {
        return weight;
    }

    public  String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public  String getName()
    {
        return name;
    }
}