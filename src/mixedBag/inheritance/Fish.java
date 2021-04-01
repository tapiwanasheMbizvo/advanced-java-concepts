package mixedBag.inheritance;

/**
 * @author tapiwanashem
 * @Date 1/4/2021
 * @Time 04:48
 * @Year 2021
 */
public class Fish extends Animal {

    private  boolean canSwim;

    public Fish(String animalName, boolean canSwim) {
        super(animalName);
        this.canSwim = canSwim;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public  void  sayHie(){

        System.out.println("HEY FROM FISH CLASS");
    }

    public  void swim(){

        System.out.println("HEY LOOK "+getAnimalName()+" IS SWMIMING");
    }
}
