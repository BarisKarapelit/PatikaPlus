package week6.java102;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;

public class FileInputStreamExample {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FileInputStreamExample.class.getName());
        try {
            File file = new File("testout.txt");
            if (file.createNewFile()) {
                logger.info(file.getName() + " file created");
            } else {
                logger.info(file.getName() + " file already exists");
            }
            FileInputStream fin = new FileInputStream(file);
            int i = fin.read();
            while (i!=-1){
                System.out.print((char)i);
                i = fin.read();
            }
            fin.close();
        } catch (Exception e) {
            logger.info("Error " + e.getMessage());
        }
    }
}
