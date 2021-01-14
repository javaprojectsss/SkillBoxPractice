import java.util.Scanner;

public class Cat {
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    public static double cmdWeight = 0.0;
    public Scanner scanner = new Scanner(System.in);

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public Cat(double scanner1) {
        scanner1 = this.scanner.nextDouble();
        cmdWeight = scanner1;

    }

    public double getCmdWeight()
    {

        return cmdWeight;

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
}