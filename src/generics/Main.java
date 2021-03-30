package generics;

import binaryops.DOCSBinaryOps;
import generics.shop.Drink;
import generics.shop.Food;
import generics.shop.Product;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 15:52
 * @Year 2021
 */
public class Main {

    public static void main(String[] args) {


        //cannot use primitive types for generics

       /* GenericClass<Double, Double> myDoubleClass = new GenericClass<>(10.0, 100.0);
        GenericClass<Integer, Double> myIntegerClass = new GenericClass<>(100, 10.0);
        GenericClass<Person, Double> myPersonClass = new GenericClass<>(new Person("Tapiwanashe"), 10.0);

        myDoubleClass.showType();
        myIntegerClass.showType();
        myPersonClass.showType();*/

       NumberFunctions<Double> doubleNumberFunctions = new NumberFunctions<>(10.0);

        System.out.println(doubleNumberFunctions.square());


        Food theFood = new Food("Burger Buns", 12.25, "Buns");
        Drink theJuice = new Drink("Minute Maid 500ml", 17.5, "Orange");

        Product product = new Product("Maize Meal", 15.90);
        Meal<Food, Drink> theMeal = new Meal<>();

       Meal<Product, Drink>  newMeal = new Meal<>();

       newMeal.setT(product);
       newMeal.setV(theJuice);

        theMeal.setT(theFood);
        theMeal.setV(theJuice);
        System.out.println(theMeal.toString());
        System.out.println("The Meal Cost "+ theMeal.getMealCost());
        System.out.println("The New Meal Cost "+ newMeal.getMealCost());
    }
}
