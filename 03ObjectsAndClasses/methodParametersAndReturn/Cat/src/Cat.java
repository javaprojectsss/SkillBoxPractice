
public class Cat
{
    private double originWeight;
    private double weight;
    
    private double minWeight;
    private double maxWeight;
    
    private double eatenFood;
    private double popped;
    
    private int randomCountToName;
    
    private String nameMurka = "Кошка Мурка";
    private String nameVasya = "Кот Вася";
    private String nameJenya = "Кошка Женя";
    private String nameTimothy = "Кот Тимофей";
    
    private String name;
    
    private String Artical = "";
    
    private String toileVoce;
    
    public String pee()
    {
        weight = weight - popped;
        return toileVoce;
    }

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        popped = Math.random()*200;
        randomCountToName = (int) ( Math.random() * 4 );
        toileVoce = randomName() + " сходил" + isaArtical() + " в туалет, потеряв " + popped + " массы" + "\nИ стал" + isaArtical() + " весить";
    }

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

    public int feed(int amount)
    {
        weight = weight + amount;
        return amount;
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
    public Double getWeight()
    {
        return weight;
    }
}
