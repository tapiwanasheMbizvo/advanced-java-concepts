package binaryops;

import java.util.function.BinaryOperator;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 15:23
 * @Year 2021
 */
public class DOCSBinaryOps {

    public static void main(String[] args) {

        System.out.println(myBinaryOperator.apply(10, 12));
    }


    private  static BinaryOperator<Integer>  myBinaryOperator = (number, number2)-> number;
}
