package mixedBag.interfaces;

import mixedBag.inheritance.Animal;

/**
 * @author tapiwanashem
 * @Date 1/4/2021
 * @Time 10:06
 * @Year 2021
 */
public class Main {

    public static void main(String[] args) {

        Fish fish = new Fish("MY FISH", true);

        Eagle eagle = new Eagle("My Eagle ", true );
        printSome(fish, Animal::isCanSwim);
        printSome(fish, Animal::isCanFly);
        printSome(eagle, Animal::isCanFly);
        printSome(eagle, Animal::isCanSwim);

    }

    static  void printSome(Animal animal, ChekAttributes attributes){

        if(attributes.testAnimal(animal)){
            System.out.println(animal.toString());

        }

    }


}
