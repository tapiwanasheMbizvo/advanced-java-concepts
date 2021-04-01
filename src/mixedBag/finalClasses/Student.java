package mixedBag.finalClasses;

import java.util.Map;

/**
 * @author tapiwanashem
 * @Date 1/4/2021
 * @Time 05:37
 * @Year 2021
 */
public final class Student {

    private final  String studentName;
    private final String regNumber;
    private final Map<String, Integer>  scoreCard;

    public Student(String studentName, String regNumber, Map<String, Integer> scoreCard) {
        this.studentName = studentName;
        this.regNumber = regNumber;
        this.scoreCard = scoreCard;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public Map<String, Integer> getScoreCard() {
        return scoreCard;
    }
}
