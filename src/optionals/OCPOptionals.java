package optionals;

import java.util.Optional;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 12:14
 * @Year 2021
 */
public class OCPOptionals {


    public static void main(String[] args) {

        String inputValue = "tapiwanashe@gmail.com";
        //if the value is null we will throw an exception
        Object value = Optional.ofNullable(inputValue)
                        .orElseThrow(()->new IllegalStateException("WELL SHAA CANT BE NULL"));

      //  System.out.println(value);


        //doing things if the value is present
    Optional.ofNullable(inputValue).ifPresent(theValue-> System.out.println("DOING THINGS WITH VALUE "+theValue));

    //this option does the logic if the value is present and shouts if not
    Optional.ofNullable(inputValue).ifPresentOrElse(
            userName-> {

                //do some amazing logic here
                //connect to database
                //get data
                //send an email
                System.out.println("Sending an Email to the user "+ inputValue);
            },

            ()-> {

                //we can do a lot here too.
                //like send to email
                // etc etc
                System.out.println("Well there is no such thing dummy");
            }
    );

       /*


       Object value = Optional.ofNullable(null)
                .orElse("default value");

        System.out.println(value);*/



    }

}
