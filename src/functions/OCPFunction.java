package functions;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 09:56
 * @Year 2021
 */
public class OCPFunction {


    public static void main(String[] args) {

        System.out.println("The value from old style  is  "+ incrementOldStyle(10));
        System.out.println("The value from new style  is  "+ myAddFunction.apply(10));
        System.out.println("Add And Multiply By 10 value  "+ addAndMultiplyFunction.apply(10));
        System.out.println("BI function add and multiply "+ myTwoArgFunction.apply(1, 10));



    }

    //old style
    private static  int incrementOldStyle(int number){

        return  number+1;
    }

    //new style use OCPFunction<T, R>
    //takes one argument T and returns a value R

    private static Function<Integer, Integer> myAddFunction = (number) -> number+1;
    private static Function<Integer, Integer> myMultiplyFunction = number-> number *10;

    //see how you can concatnate functions
    private static Function<Integer, Integer> addAndMultiplyFunction = myAddFunction.andThen(myMultiplyFunction).andThen(number->number-100);

    //wow a function that takes two arguments and returns something
    private static BiFunction<Integer, Integer, Integer>  myTwoArgFunction = (number, number2)-> (number+1)*number2;

    //se how we can use a bifunction to do login
    private  static  BiFunction<String, String, Boolean> myLoginFunction = (username , password )-> username.equalsIgnoreCase("username") && (password.equalsIgnoreCase("password"));







}
