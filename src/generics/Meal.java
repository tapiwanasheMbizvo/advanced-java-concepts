package generics;

import generics.shop.Product;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 19:18
 * @Year 2021
 */
public class Meal<T extends Product, V extends  Product> {

    T t ;
    V v;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return  v.toString()+"  "+ t.toString();
    }

    double getMealCost(){

        return  v.getProductPrice()+ t.getProductPrice();
    }
}
