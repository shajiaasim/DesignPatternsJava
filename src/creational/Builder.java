package creational;

import java.util.ArrayList;
import java.util.List;

public class Builder {

    public static void main(String [] args){
        Meal vegMeal = MealBuilder.prepVeg();
        Meal nonVegMeal = MealBuilder.prepNonVeg();

        System.out.println("Veg meal price");
        System.out.println(vegMeal.showPrice());

        System.out.println("NonVeg Meal price");
        System.out.println(nonVegMeal.showPrice());
    }
}

class MealBuilder{
    static Meal prepVeg(){
        Meal meal= new Meal();
        meal.addItems(new VegBurger());
        meal.addItems(new Pepsi());
        return meal;
    }

    static Meal prepNonVeg(){
        Meal meal= new Meal();
        meal.addItems(new ChickenBurger());
        meal.addItems(new Coke());
        return meal;
    }
}

class Meal {

    List<Item> items = new ArrayList<Item>();

    int totalPrice;

    void addItems(Item item){
        items.add(item);
    }

    float showPrice(){

        for (Item item:this.items){
            totalPrice+=item.getPrice();
        }
    return totalPrice;
    }
}

interface Item{
    String getName();
    Packing getPacking();
    int getPrice();
}

interface Burger extends Item{

}

interface ColdDrinks extends Item{

}

class ChickenBurger implements Burger{

    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public Packing getPacking() {
        return new Wrapper();
    }

    @Override
    public int getPrice() {
        return 10;
    }
}

class VegBurger implements Burger{

    @Override
    public String getName() {
        return "Veg Burger";
    }

    @Override
    public Packing getPacking() {
        return new Wrapper();
    }

    @Override
    public int getPrice() {
        return 8;
    }
}


class Coke implements ColdDrinks{

    @Override
    public String getName() {
        return "Coke";
    }

    @Override
    public Packing getPacking() {
        return new Bottle();
    }

    @Override
    public int getPrice() {
        return 2;
    }
}

class Pepsi implements ColdDrinks{

    @Override
    public String getName() {
        return "Pepsi";
    }

    @Override
    public Packing getPacking() {
        return new Bottle();
    }

    @Override
    public int getPrice() {
        return 3;
    }
}


interface Packing{
    void pack();
}

class Wrapper implements Packing{

    @Override
    public void pack() {
        System.out.println("Pack in a wrapper");
    }
}

class Bottle implements Packing{

    @Override
    public void pack() {
        System.out.println("Pack in a Bottle");
    }
}






