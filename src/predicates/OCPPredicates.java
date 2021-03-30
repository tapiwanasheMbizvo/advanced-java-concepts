package predicates;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 10:49
 * @Year 2021
 */

/**
 *
 * Predicate function is an one arg func that returns a boolean
 */
public class OCPPredicates {

    public static void main(String[] args) {

        System.out.println("Old style validate "+ isPhoneNumberValid("07757198817"));

        //lets use predicate
        System.out.println("Predicate  "+phoneNumberValidatePredicate.test("07757198817"));

        //lets chain predicates , you can chain with and./ or
        System.out.println("Predicates chained using and  "+ phoneNumberValidatePredicate.and(containsNumber3).test("07757148817"));
        System.out.println("Predicates chained  using or "+ phoneNumberValidatePredicate.or(containsNumber3).test("07757148817"));
    }

    //old style checking is number is valid
    private static  boolean isPhoneNumberValid(String phoneNumber){

        return  phoneNumber.startsWith("07") && phoneNumber.length()>=10 && phoneNumber.length()<13;

    }

    //use predictaes
    private static Predicate<String> phoneNumberValidatePredicate = phoneNumber ->  phoneNumber.startsWith("07") && phoneNumber.length()>=10 && phoneNumber.length()<13;
    private static  Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

    //use biPredicates

    private static BiPredicate<String, String > myBiPredicateLogin = (username, password)-> username.length()>3 &&password.length()>6;

}
