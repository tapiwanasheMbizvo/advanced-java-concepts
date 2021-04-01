package mixedBag.inheritance;

/**
 * @author tapiwanashem
 * @Date 1/4/2021
 * @Time 05:01
 * @Year 2021
 */
public class Dog extends  Animal {
    private boolean canBark;

    public Dog(String animalName, boolean canBark) {
        super(animalName);
        this.canBark = canBark;
    }

    public boolean isCanBark() {
        return canBark;
    }

    public void setCanBark(boolean canBark) {
        this.canBark = canBark;
    }

    public  void sayHie(){

        System.out.println("HI FROM DOG");
    }

    public  void bark(){

        System.out.println("HEY LOOK "+getAnimalName()+" IS BARKING ");
    }
}
