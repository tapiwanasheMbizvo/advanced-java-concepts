package generics;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 16:00
 * @Year 2021
 */
public class NumberFunctions<T extends  Number> {

    T t ;

    public NumberFunctions(T t) {
        this.t = t;
    }

    double square(){

        return  t.intValue()* t.intValue();
    }
}
