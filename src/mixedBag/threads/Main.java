package mixedBag.threads;

/**
 * @author tapiwanashem
 * @Date 1/4/2021
 * @Time 11:32
 * @Year 2021
 */
public class Main {

    public static void main(String[] args) {


        Runnable r = ()->{
            //

            int x = 0;
            while (x<100){

                System.out.println("Value is X is :"+x);
                x+=10;
            }
        };

        Thread t = new
                Thread(r);

        t.start();
    }
}


class  myClass implements  Runnable{

    @Override
    public void run() {
        System.out.println("Run my method");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new myClass());
        t.start();
    }
}

class  anotherClass extends  Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("run My metod ");
    }

    public static void main(String[] args) {

        Thread mythread = new anotherClass();

        mythread.start();
    }

}