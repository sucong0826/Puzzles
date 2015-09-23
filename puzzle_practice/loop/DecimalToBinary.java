package puzzle_practice.loop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SuCong on 2015/09/22.
 */
public class DecimalToBinary {
    private int targetDecimal;

    public DecimalToBinary(int targetDecimal) {
        this.targetDecimal = targetDecimal;
    }

    public String convertDecimalToBinaryString() {
        String result = "";
        if (this.targetDecimal > 0) {
            final int DIVIDER = 2;
            int remains = targetDecimal;
            List<Integer> numbers = new ArrayList<>();

            while (remains / DIVIDER >= 0) {
                numbers.add(remains % DIVIDER);
                remains /= DIVIDER;
                if (remains == 0) break;
            }

            for (int i = numbers.size(); i > 0; i--) {
                result += numbers.get(i - 1);
            }
        } else {

        }

        return result;
    }
}
