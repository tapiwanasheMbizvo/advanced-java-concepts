package mixedBag.interfaces.usepredicateInterface;

import mixedBag.inheritance.Animal;
import mixedBag.inheritance.Fish;

import java.util.function.Predicate;

/**
 * @author tapiwanashem
 * @Date 1/4/2021
 * @Time 10:23
 * @Year 2021
 */
public class Main {

    public static void main(String[] args) {

        Fish fish = new Fish("MY SECOND FISH", true);

       // doSomeStuff(fish, animal -> animal.isCanSwim());

        System.out.println("CAN THIS ANIMAL FLY "+checkIfAnimalCanFly.test(fish));
        System.out.println("CAN THIS ANIMAL SWIM "+checkIfAnimalCanSwim.test(fish));

    }

    static  void doSomeStuff(Animal animal, Predicate<Animal> animalPredicate){


        if(animalPredicate.test(animal)){

            System.out.println(animal.toString());
        }
    }

    static  Predicate<Animal> checkIfAnimalCanFly = animal -> animal.isCanFly();
    static  Predicate<Animal> checkIfAnimalCanSwim = animal -> animal.isCanSwim();
}
