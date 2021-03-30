package consumer;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 10:37
 * @Year 2021
 */

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * A consumer represents an op that takes a single arg and returns no output
 *
 */
public class OCPConsumer {

    public static void main(String[] args) {


        Customer tapiwanashe_ = new Customer("Tapiwanashe ", "0775719881");
        greetCustomer(tapiwanashe_);
        greetCustomerConsumer.accept(tapiwanashe_);
        greetAndGiveMoney.accept(tapiwanashe_, 10);


    }



    static BiConsumer<Customer, Integer> greetAndGiveMoney = (customer, amount) -> {

        greetCustomer(customer);
        System.out.println("YOU Have "+amount);
    };

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("hello "+customer.customerName+"  thanks for reg your phone number is "+ customer.customerPhoneNumber);

    static  void greetCustomer(Customer customer){

        System.out.println("hello "+customer.customerName+"  thanks for reg your phone number is "+ customer.customerPhoneNumber);
    }

    static  class Customer {


        private final String customerName;
        private final String customerPhoneNumber;

         Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
