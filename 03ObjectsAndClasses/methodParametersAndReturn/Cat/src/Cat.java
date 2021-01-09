
public class Cat
{
    private double originWeight;
    private double weight;
    private double minWeight;
    private double maxWeight;
    public double eatenFood;
    public double popped;
    public  int randomCountToName;
    public String nameMurka = "Кошка Мурка";
    public String nameVasya = "Кот Вася";
    public String nameJenya = "Кошка Женя";
    public String nameTimothy = "Кот Тимофей";
    public String name;
    public boolean a = false;
    public String Artical = "";

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        eatenFood = Math.random()*100;
        popped = Math.random()*200;
        randomCountToName = (int) ( Math.random() * 4 );
    }

    public double wentToTheToilet(){ return weight - popped; }

    public double eatenWeight() { return weight + eatenFood; }

    public String randomName() {
        if (randomCountToName == 0) {
            name = nameMurka;
        }
        if (randomCountToName == 1) {
            name = nameVasya;
        }
        if (randomCountToName == 2) {
            name = nameJenya;
        }
        if (randomCountToName == 3) {
            name = nameTimothy;

        }
        return name;
    }
    public String isaArtical() {
        if ((name == nameJenya) || (name == nameMurka)){
            Artical = "а";
        }
        return Artical;
    }


    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
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