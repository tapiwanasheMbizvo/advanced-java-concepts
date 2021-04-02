package mixedBag.filesIO;

import java.io.*;
import java.util.function.Predicate;

/**
 * @author tapiwanashem
 * @Date 2/4/2021
 * @Time 05:11
 * @Year 2021
 */
public class Main {

    public static void main(String[] args) {

       File source = new File("OBI_20200825_144057_0001");
       File destination = new File("HAPPY_NICE.txt");

       Predicate<String> lineStartsWithRCTP10AndIsNotNull =(s -> s!=null && s.startsWith("RCTP10"));
        try {
            NiceReader.readFromFileFilterAndOutputToDestination(source, destination, lineStartsWithRCTP10AndIsNotNull);
        } catch (IOException e) {
            e.printStackTrace();

        }

    }




}
