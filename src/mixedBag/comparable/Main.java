package mixedBag.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author tapiwanashem
 * @Date 1/4/2021
 * @Time 22:19
 * @Year 2021
 */
public class Main {

    public static void main(String[] args) {


        Kid kid1 = new Kid("Tadis", 1);
        Kid kid2 = new Kid("Wadza", 2);
        Kid kid3 = new Kid("Muffin", 3);
        Kid kid4 = new Kid("Charles", 4);

        /*List<Kid> kidList = List.of(
                new Kid("Tadis", 1),
                new Kid("Wadza", 2),
                new Kid("Muffin", 3),
                new Kid("Charles", 4)



        );*/

        List<Kid> kidList = new ArrayList<>();
        kidList.add(kid1);
        kidList.add(kid2);
        kidList.add(kid3);
        kidList.add(kid4);
        System.out.println("Unordered LIST OF KIDS :"+kidList);
        Collections.sort(kidList);
        System.out.println("Ordered LIST OF KIDS :"+kidList);
    }
}
