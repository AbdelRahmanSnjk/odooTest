
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author absisa
 */
public class ex2 {

    public static void main(String[] args) {

        int UPPER_LIMIT = 1000000;
        int LOWER_LIMIT = 1;

        //UPPER_LIMIT + 1 because it is exclusive
        int riddleNumber = ThreadLocalRandom.current().nextInt(LOWER_LIMIT, UPPER_LIMIT + 1);
        int myNumber = -1;

        int trials = 0;

        System.out.println("The number to look for:" + riddleNumber);

        while (myNumber != riddleNumber) {
            myNumber = ThreadLocalRandom.current().nextInt(LOWER_LIMIT, UPPER_LIMIT + 1);
            System.out.println("myNumber:" + myNumber);
            System.out.println("UPPER_LIMIT:" + UPPER_LIMIT);
            System.out.println("LOWER_LIMIT:" + LOWER_LIMIT);

            switch (verify(myNumber, riddleNumber)) {
                case 1:
                    UPPER_LIMIT = myNumber;
                    break;
                case -1:
                    LOWER_LIMIT = myNumber;
                    break;
                case 0:
                    System.out.println("found the number:" + myNumber + " in " + trials + " steps.");
                    break;

            }
            trials++;

        }
    }

    public static int verify(int myNumber, int riddleNumber) {
        if (myNumber < riddleNumber) {
            return -1;
        } else if (myNumber > riddleNumber) {
            return 1;
        } else {
            return 0;
        }

    }
}
