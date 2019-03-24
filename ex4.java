import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author absisa
 */
public class ex4 {

    public static void main(String[] args) {
        int sum = 0;
        List<String> ls = new ArrayList<>();

        for (int i = 76; i < 200; i++) {
            if (ThreadLocalRandom.current().nextInt(0, 1 + 1) == 0) {
                //generate a string
                ls.add((char) i + "");
            } else {
                //generate number
                ls.add(i + "");
            }
        }

        System.out.println(sum(ls, 0, 0));

    }

    public static int sum(List<String> ls, int sum, int index) {
        if (index == ls.size()) {
            return sum;
        }
        try {
            sum += Integer.parseInt(ls.get(index));
        } catch (NumberFormatException ex) {

        }
        return sum(ls, sum, index + 1);
    }
}
