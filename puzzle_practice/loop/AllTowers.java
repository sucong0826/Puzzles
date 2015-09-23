package puzzle_practice.loop;

/**
 * 打印金字塔的练习;
 * <p>
 * Created by SuCong on 2015/09/22.
 */
public class AllTowers {
    /**
     * Print tower lines;
     *
     * @param lines how many lines in tower
     */
    public static void printTowerOne(int lines) {
        for (int i = 0; i < lines; i++) { // control it from top to bottom
            int startNumber = i + 1;

            // print spaces in front of start number;
            for (int formerCounter = i; formerCounter < lines - 1; formerCounter++) {
                System.out.print("   "); // 3 spaces
            }

            // print number between spaces;
            for (int nCounter = 0; nCounter < (2 * i + 1) / 2 + 1; nCounter++) {
                if (startNumber >= 10)
                    System.out.print(startNumber-- + " ");
                else
                    System.out.print(startNumber-- + "  ");

                if (startNumber == 0)
                    startNumber = 1;
            }

            for (int nCounter = 0; nCounter < (2 * i + 1) / 2; nCounter++) {
                System.out.print(++startNumber + "  ");
            }

            // print spaces in front of start number;
            for (int latterCounter = i; latterCounter < lines - 1; latterCounter++) {
                System.out.print("   "); // 3 spaces
            }

            // change line;
            System.out.println();
        }
    }

    /**
     * print how many lines tower;
     *
     * @param lines how many lines
     */
    public static void printTowerTwo(int lines) {
        for (int i = 0; i < lines; i++) {

            // print number;
            for (int nCounter = 0; nCounter < i + 1; nCounter++) {
                System.out.print(nCounter + 1 + "  ");
            }

            System.out.println();
        }
    }

    public static void printTowerThree(int lines) {
        System.out.println();

        int linesCopy = lines;
        for (int i = 0; i < lines; i++) {
            //　print numbers;
            for (int nCounter = 0; nCounter < linesCopy; nCounter++) {
                System.out.print(nCounter + 1 + "  ");
            }

            System.out.println();
            linesCopy--;
        }
    }

    public static void printTowerFour(int lines) {
        System.out.println();

        for (int i = 0; i < lines; i++) { // controls lines
            int startNumber = 2;
            // 1. prints spaces;
            for (int sCounter = i; sCounter < lines; sCounter++) {
                System.out.print("     ");
            }

            // 2.print numbers;
            for (int nCounter = 0; nCounter < (2 * i + 1) / 2 + 1; nCounter++) {
                int printNumber = (int) Math.pow(startNumber, nCounter);
                if (printNumber >= 1000) {
                    System.out.print(printNumber + " ");
                } else if (printNumber >= 100) {
                    System.out.print(printNumber + "  ");
                } else if (printNumber >= 10) {
                    System.out.print(printNumber + "   ");
                } else {
                    System.out.print(printNumber + "    ");
                }
            }

            for (int nCounter = (2 * i + 1) / 2; nCounter > 0; nCounter--) {
                int printNumber = (int) Math.pow(startNumber, nCounter - 1);
                if (printNumber >= 1000) {
                    System.out.print(printNumber + " ");
                } else if (printNumber >= 100) {
                    System.out.print(printNumber + "  ");
                } else if (printNumber >= 10) {
                    System.out.print(printNumber + "   ");
                } else {
                    System.out.print(printNumber + "    ");
                }
            }

            // change line;
            System.out.println();
        }
    }
}
