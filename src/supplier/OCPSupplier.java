package supplier;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 11:07
 * @Year 2021
 */

import java.util.function.Supplier;

/**
 * Represents a supplier of results
 *
 */
public class OCPSupplier {

    public static void main(String[] args) {

        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionURLSupplier.get());
    }

    static  String getDBConnectionUrl(){

        return  "jdbc://localhost:8080/users";
    }

    private  static Supplier<String> getDBConnectionURLSupplier = ()-> "jdbc://localhost:8080/users";
}
