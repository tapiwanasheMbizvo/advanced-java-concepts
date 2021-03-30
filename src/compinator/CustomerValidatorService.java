package compinator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 13:33
 * @Year 2021
 */
public class CustomerValidatorService {


    private   boolean isEmailValid (String email ){

     return  email.contains("@") &&email.contains(".") && email.length()>3;

    }

    private   boolean isPhoneNumberValid (String phoneNUmber){

        return  phoneNUmber.length()>7 && phoneNUmber.startsWith("07");
    }

    private   boolean isAdult (LocalDate dateOfBirth ){

        return Period.between(dateOfBirth, LocalDate.now()).getYears()>16;


    }

    public  boolean isValidCustomer(Customer customer){

        return  isEmailValid(customer.getEmail()) &&
                isPhoneNumberValid(customer.getPhoneNUmber())&&
                isAdult(customer.getDateOfBirth());
    }
}
