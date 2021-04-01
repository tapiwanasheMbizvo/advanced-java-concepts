package mixedBag.interfaces;

import mixedBag.inheritance.Animal;

/**
 * @author tapiwanashem
 * @Date 1/4/2021
 * @Time 10:15
 * @Year 2021
 */
public class Fish extends Animal {

    public Fish(String animalName, boolean caswim) {
        super(animalName);
        this.setCanSwim(caswim);

    }



}
