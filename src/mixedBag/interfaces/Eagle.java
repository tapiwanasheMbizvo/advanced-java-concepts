package mixedBag.interfaces;

import mixedBag.inheritance.Animal;

/**
 * @author tapiwanashem
 * @Date 1/4/2021
 * @Time 05:53
 * @Year 2021
 */
public class Eagle extends Animal implements Fly {


    public Eagle(String animalName, boolean canFly) {
        super(animalName);
        this.setCanFly(canFly);
    }

    @Override
    public int getWingSpan() {
        return 15;
    }

    @Override
    public void land() {

        System.out.println("Eagle is diving to land");
    }
}
