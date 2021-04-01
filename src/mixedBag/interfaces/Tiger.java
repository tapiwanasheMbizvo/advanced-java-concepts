package mixedBag.interfaces;

import mixedBag.inheritance.Animal;

/**
 * @author tapiwanashem
 * @Date 1/4/2021
 * @Time 09:56
 * @Year 2021
 */
public class Tiger extends Animal implements Sprint {

    public Tiger(String animalName) {
        super(animalName);
    }

    public  void  sprint(Animal animal){

        System.out.println("ANIMAL IS SPRINTING FAST "+animal.toString());
    }
}
