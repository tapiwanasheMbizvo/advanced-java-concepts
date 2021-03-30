package generics;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 15:52
 * @Year 2021
 */
public class GenericClass<T, V> {

    T t;
    V v;

    public GenericClass(T t, V v) {
        this.t = t;
        this.v = v;
    }

    void showType(){

        System.out.println(t.getClass().getName());
    }
}
