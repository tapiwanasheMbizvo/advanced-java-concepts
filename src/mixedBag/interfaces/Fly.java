package mixedBag.interfaces;

/**
 * @author tapiwanashem
 * @Date 1/4/2021
 * @Time 05:50
 * @Year 2021
 */
public interface Fly {

      int getWingSpan();
      static  final int MAX_SPEED = 100;
      default  void  land(){

        System.out.println("ANIMAL IS LANDING");
    }

    static  double calculateSpeed(float distance, double time){

        return  distance/time;

    }

}
