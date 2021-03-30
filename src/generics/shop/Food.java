package generics.shop;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 19:13
 * @Year 2021
 */
public class Food extends  Product {

    private String foodType;

    public Food(String productName, Double productPrice, String foodType) {
        super(productName, productPrice);
        this.foodType = foodType;
    }

    public Food(String productName, Double productPrice) {
        super(productName, productPrice);
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public String toString() {
        return "Food{" +
                "ProductName='" + this.getProductName() + '\'' +
                "ProductPrice='" + this.getProductPrice() + '\'' +
                "foodType='" + foodType + '\'' +
                '}';
    }
}
