package mixedBag.enums;

/**
 * @author tapiwanashem
 * @Date 1/4/2021
 * @Time 05:14
 * @Year 2021
 */
public enum Season {

    WINTER("LOW", 25), SPRING("MEDIUM",75), SUMMER("HIGH",100), AUTUM("MEDIUM",100);

    private String temp;

    private int number;

     Season(String temp, int number){
        this.temp = temp;
        this.number = number;
    }
    public String getTemp() {
        return temp;
    }

    public  void  doSome(){

        //whatever algo here

        System.out.println("DO SOME SHIT ");
    }


}
