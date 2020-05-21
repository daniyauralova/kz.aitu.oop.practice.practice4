package com.company;
public class Aquarium {
    protected double price = 0;
    protected double weight = 0;

    private static double totalPrice = 0;

    public Aquarium(double price, double weight)    {
        this.price = price;
        this.weight = weight;
        totalPrice += this.price;
    }


    public Aquarium(double price) {
        this.price = price;
        totalPrice += this.price;
    }

    public static double getTotalPrice()
    {
        return totalPrice;
    }

    public static void main(String[] args) {

        Aquarium ob1 = new Aquarium(20, 5);

        Fish fish1 = new Fish(25,"Angel Fish");
        Fish fish2 = new Fish(24, "Dragon Fish");
        Fish fish3 = new Fish(26,"Gold Barb");
        Reptile reptile = new Reptile(30,"Reptile");
        Accessory accessory = new Accessory(13.5,  "Magnet cleaner");
        System.out.println("Angel Fish, Dragon Fish , Gold Barb,Reptile, Magnet cleaner");
        System.out.println("Total price " + getTotalPrice());
    }
}














