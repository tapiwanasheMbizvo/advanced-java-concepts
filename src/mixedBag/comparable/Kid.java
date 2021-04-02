package mixedBag.comparable;

/**
 * @author tapiwanashem
 * @Date 1/4/2021
 * @Time 22:20
 * @Year 2021
 */
public class Kid implements  Comparable<Kid>{

    private String name;
    private int kidID;

    public Kid(String name, int kidID) {
        this.name = name;
        this.kidID = kidID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKidID() {
        return kidID;
    }

    public void setKidID(int kidID) {
        this.kidID = kidID;
    }

    @Override
    public int compareTo(Kid kid) {
        return  name.compareTo(kid.name);
    }

    @Override
    public String toString() {
        return "Kid{" +
                "name='" + name + '\'' +
                ", kidID=" + kidID +
                '}';
    }
}
