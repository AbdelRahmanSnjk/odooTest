import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author absisa
 */
public class ex5 {

    public static void main(String[] args) {
        try {

            File fileToReadFrom = new File("hello.png");
            File fileToWriteTo = new File("nbwords.png");
            FileOutputStream fw = new FileOutputStream(fileToReadFrom);

            FileInputStream fis = new FileInputStream(fileToWriteTo);

            while (fis.available() > 0) {
                byte[] bytes = fis.readNBytes(7);
                for (int i = 0; i < bytes.length - 1; i++) {
                    fw.write(bytes[i]);
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ex5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ex5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
