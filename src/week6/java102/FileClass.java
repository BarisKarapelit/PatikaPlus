package week6.java102;

import java.io.File;
import java.util.logging.Logger;

public class FileClass {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FileClass.class.getName());// Initialize logger
        File directory = new File("test");
        String directoryResult = directory.mkdir()==false ? "The directory already exits" : "The directory is created.";
        logger.info(directoryResult);
        File file = new File("patina.txt");
        try {
            if (file.createNewFile()) {
                logger.info(file.getName() + " file created");
            } else {
                logger.info(file.getName() + " file already exists");
            }
        } catch (Exception exception) {
            logger.info(exception.getMessage());
        }
    }
}
