package compinator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import static compinator.CustomerRegValidator.ValidationResult.*;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 13:50
 * @Year 2021
 */
public interface CustomerRegValidator extends Function< Customer, CustomerRegValidator.ValidationResult> {


    static  CustomerRegValidator isEmailVaild(){

        return  customer -> customer.getEmail().contains("@")
                ? SUCCESS
                : EMAIL_NOT_VALID;
    }

    static  CustomerRegValidator isPhoneNumberValid(){

        return  customer -> customer.getPhoneNUmber().startsWith("07")
                ? SUCCESS
                : PHONE_NUMBER_NOT_VALID;
    }

    static  CustomerRegValidator isAnAdult(){

        return  customer ->(Period.between(customer.getDateOfBirth(), LocalDate.now()).getYears()> 16)
                ? SUCCESS
                : IS_NOT_AN_ADULT;
    }


    default  CustomerRegValidator  and (CustomerRegValidator other){

        return  customer -> {

           ValidationResult result = this.apply(customer);
           return  result.equals(SUCCESS) ? other.apply(customer) : result;
        };

    }

    enum  ValidationResult {
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }

}
