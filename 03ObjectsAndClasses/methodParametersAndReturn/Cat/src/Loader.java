
public class Loader {
    public static void main(String[] args) {
        Cat catname = new Cat();
           System.out.println(catname.randomName() + " весил" + catname.isaArtical() + " : " + catname.getWeight() + " грамм");

           System.out.println(catname.randomName() + " съел" + catname.isaArtical() + " " + catname.eatenFood + " грамм еды");

           System.out.println("После того как " + catname.randomName() + " поел" + catname.isaArtical() + " вес стал таким: " + catname.eatenWeight());

           Cat catname1 = new Cat();
        System.out.println("\n" + "\n" + catname1.randomName() + " весил" + catname1.isaArtical() + " : " + catname1.getWeight() + " грамм " );

        System.out.println(catname1.randomName() + " сходил" + catname1.isaArtical() + " в туалет и потерял столько массы: " + catname1.popped + " грамм ");

        System.out.println("После похода в туалет " + catname1.randomName() + " стал" + catname1.isaArtical() + " весить: " + catname1.wentToTheToilet());
    }
}


