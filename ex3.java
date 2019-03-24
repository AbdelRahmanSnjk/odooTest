import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author absisa
 */
public class ex3 {

    public static void main(String[] args) {
        int sum = 0;
        List<String> ls = new ArrayList<>();

        for (int i = 76; i < 200; i++) {
            if (ThreadLocalRandom.current().nextInt(0, 1 + 1) == 0) {
                //generate a string
//                System.out.println((char) i);
                ls.add((char) i + "");
            } else {
                //generate number
//                System.out.println(i);
                ls.add(i + "");
            }
        }

        for (String s : ls) {
            try {
                sum += Integer.parseInt(s);
            } catch (NumberFormatException ex) {

            }
        }

        System.out.println("");
        System.out.println(sum);
    }
}
