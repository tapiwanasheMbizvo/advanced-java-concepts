package javaoptionals;

import java.util.Optional;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 12:18
 * @Year 2021
 */
public class JAVAOptionals {

    public static void main(String[] args) {

        Optional<Object> empty = Optional.of("hello");

        System.out.println(empty.isPresent());


    }

}
