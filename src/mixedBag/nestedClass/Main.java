package mixedBag.nestedClass;

/**
 * @author tapiwanashem
 * @Date 1/4/2021
 * @Time 19:48
 * @Year 2021
 */
public class Main {

    public static void main(String[] args) {
        Employee employee = ()->{
            //
            System.out.println("Do some slick stuff");
        };

       // employee.doRegistration();


        Staff staff = new Staff(){


            @Override
            void doStaffStuff(int x) {

                while (x<100){

                    System.out.println("x is "+x);
                    x+=10;
                }
            }
        };

        staff.doStaffStuff(50);
    }

    Human human = new Human() {
        @Override
        void doHumanStuff() {
            super.doHumanStuff();
        }
    };
}
