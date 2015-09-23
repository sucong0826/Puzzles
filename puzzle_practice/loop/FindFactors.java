package puzzle_practice.loop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SuCong on 2015/09/21.
 */
public class FindFactors {
    private int targetInteger;
    private boolean isOver;
    private int[] resultArray;

    public FindFactors(int yourInteger) {
        this.targetInteger = yourInteger;
    }

    public int[] getFactors() {
        int result = this.targetInteger;
        int factor = 2;
        List<Integer> factorsList = new ArrayList<>();

        while (!isOver) {
            if (result % factor == 0) {
                factorsList.add(factor);
                result /= factor;
                factor = 2;
            } else {
                factor++;
            }

            int sum = 1;
            for (int item : factorsList) {
                sum *= item;
            }

            isOver = sum == this.targetInteger;
        }

        resultArray = new int[factorsList.size()];
        int i = 0;
        for (int item : factorsList)
            resultArray[i++] = item;

        return resultArray;
    }

    public void printOutResult() {
        for (int i = 0; i < getFactors().length; i++) {
            System.out.println(getFactors()[i] + ",");
        }
    }
}
