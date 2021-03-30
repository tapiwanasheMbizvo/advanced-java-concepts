package lampdas;

import java.util.function.Function;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 14:26
 * @Year 2021
 */
public class OCPLambdas {

    public static void main(String[] args) {


        Function<String, String> upperCaseName = name->  {

            //do some nice thigns
            System.out.println("hey there ");
            return name.toUpperCase();
        };

        upperCaseName.apply("Tapiwanashe");

    }
}
