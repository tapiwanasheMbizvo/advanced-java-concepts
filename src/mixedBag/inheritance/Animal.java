package mixedBag.inheritance;

/**
 * @author tapiwanashem
 * @Date 1/4/2021
 * @Time 04:47
 * @Year 2021
 */
public class Animal {

    private String animalName;
    private boolean canFly;
    private boolean canSwim;

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public  void animalGeneric(){

        System.out.println("GENERIC ANIMAL METHOD");
    }
    public  void  sayHie(){

        System.out.println("HEY FROM ANIMAL CLASS");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", canFly=" + canFly +
                ", canSwim=" + canSwim +
                '}';
    }
}
