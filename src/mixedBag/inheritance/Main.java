package mixedBag.inheritance;

/**
 * @author tapiwanashem
 * @Date 1/4/2021
 * @Time 04:52
 * @Year 2021
 */
public class Main {

    public static void main(String[] args) {


        Animal animal = new Animal("LION");
        Fish fish = new Fish("BREAM", true);
        Dog dog = new Dog("CHURCH", true);

        animal.sayHie();
        fish.sayHie();
        dog.sayHie();

        Animal a1, a2, a3;

        a1 = new Animal("Generic Animal");
        a2 = new Fish("MY FISH", true);
        a3 = new Dog("BUSTER", true);

        ((Fish) a2).swim();
        ((Dog) a3).bark();






    }
}
