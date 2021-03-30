package generics.shop;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 19:13
 * @Year 2021
 */
public class Drink extends  Product {
    private String drinkFlavour;

    public Drink(String productName, Double productPrice) {
        super(productName, productPrice);
    }

    public Drink(String productName, Double productPrice, String drinkFlavour) {
        super(productName, productPrice);
        this.drinkFlavour = drinkFlavour;
    }

    public String getDrinkFlavour() {
        return drinkFlavour;
    }

    public void setDrinkFlavour(String drinkFlavour) {
        this.drinkFlavour = drinkFlavour;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "ProductName='" + this.getProductName() + '\'' +
                "ProductPrice='" + this.getProductPrice() + '\'' +
                "drinkFlavour='" + drinkFlavour + '\'' +
                '}';
    }
}
