package compinator;

import java.time.LocalDate;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 13:39
 * @Year 2021
 */
public class Main {




    public static void main(String[] args) {
        Customer customer = new Customer("Solomons", "sologamail.com", "0775717887", LocalDate.of(2005, 1,27));


        CustomerValidatorService validatorService = new CustomerValidatorService();

       /* System.out.println(validatorService.isValidCustomer(customer));

        if(validatorService.isValidCustomer(customer)){

            //do db stuff or some logic ????

            System.out.println(" HEY  THERE DOING SOME ALGO ");

        }*/


       //using combinator pattern


        CustomerRegValidator.ValidationResult res = CustomerRegValidator.isEmailVaild().and(CustomerRegValidator.isPhoneNumberValid()).and(CustomerRegValidator.isAnAdult()).apply(customer);


      if(res != CustomerRegValidator.ValidationResult.SUCCESS){
          throw  new IllegalStateException("HEY THERE WAIT THERE IS AN ERROR "+res);

      }

    }
}
