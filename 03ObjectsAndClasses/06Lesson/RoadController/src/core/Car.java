package core;

public class Car {
    public String number;
    public int height;
    public double weight;
    public boolean hasVehicle;
    public boolean isSpecial;


    public void setNumber(double weight)
    { this.weight = weight; }

    public void setNumber(int height)
    { this.height = height; }

    public void setNumber(String number)
    { this.number = number; }


    public String getNumber()
    { return number; }

    public double getWeight()
    { return weight; }

    public int getHeight()
    { return height; }


    public String toString() {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}