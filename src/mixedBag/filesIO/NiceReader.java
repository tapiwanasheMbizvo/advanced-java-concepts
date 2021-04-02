package mixedBag.filesIO;

/**
 * @author tapiwanashem
 * @Date 2/4/2021
 * @Time 07:56
 * @Year 2021
 */

import java.io.*;
import java.util.function.Predicate;
import java.util.logging.Logger;

/**
 *
 */
public class NiceReader {

    /**
     *
     * @param source the input file dir
     * @param destination the output file dir
     * @param filterPattern  is a predicate that dictates the filter pattern
     * @throws IOException  in case something goes wrong with IO then this  will throw an IO
     */

    private static Logger logger = Logger.getLogger(NiceReader.class.getName());
    public static void readFromFileFilterAndOutputToDestination(File source, File destination, Predicate<String> filterPattern) throws IOException {

        try(BufferedReader reader = new BufferedReader(new FileReader(source)); BufferedWriter writer = new BufferedWriter(new FileWriter(destination)) ) {
            logger.info("READING FILE FROM "+source.getAbsolutePath()+" AND FILTERING TO "+destination.getAbsolutePath());
            reader.lines().filter(filterPattern).forEach(s -> write(writer, s));
            logger.info("DONE");
        }
    }


    private  static void write(BufferedWriter writer, String s) {
        if(s!=null){
            try {
                writer.write(s);
                writer.newLine();
                writer.flush();
            } catch (IOException e) {
                logger.info("FAILED TO READ/WRITE "+e.getMessage());
            }finally {
              //  logger.info("READING DONE");
            }

        }
    }

}
