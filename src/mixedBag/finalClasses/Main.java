package mixedBag.finalClasses;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tapiwanashem
 * @Date 1/4/2021
 * @Time 05:39
 * @Year 2021
 */
public class Main {

    public static void main(String[] args) {


        Map<String , Integer> scoreCard = new HashMap<>();

        scoreCard.put("MATHS", 1);
        scoreCard.put("SHONA", 2);
        scoreCard.put("ENGLISH", 3);

        Student student = new Student("Tapiwanashe", "R2120", scoreCard);

        System.out.println(student.getScoreCard());
    }
}
