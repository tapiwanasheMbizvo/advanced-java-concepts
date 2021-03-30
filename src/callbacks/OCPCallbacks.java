package callbacks;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 14:10
 * @Year 2021
 */
public class OCPCallbacks {


    public static void main(String[] args) {

        Consumer<String> theCallBack = value ->{

            //the callback there
            System.out.println("Hey there this is the callback ");

        };

        hello("john",  null, theCallBack);
    }

    static  void hello(String firstName, String lastName, Consumer<String> callback){


        System.out.println(firstName);
        if (lastName!=null){

            System.out.println(lastName);
        }else{
            callback.accept(firstName);
        }
    }

}
