package puzzle_arrays;

/**
 * Sudoku solution and learn what will be teach me;
 * 这里我所解决的问题只是我们在输入一个9x9的矩阵后，让用户输入结果，通过静态方法isValid来校验而已。
 * 但是真正的数独算法并不是这样的，我会在之后的更新中，不断添加<strong>回溯算法</strong>.
 * <p/>
 * Created by SuCong on 2015/9/7.
 */
public class Sudoku {

    /**
     * @param grid see an array as a sudoku
     * @return is a valid sudoku
     */
    private static boolean isValid(int[][] grid) {
        // check whether each row has numbers 1 to 9, check 9 times totally;
        for (int i = 0; i < 9; i++) {
            if (!is1To9(grid[i]))
                return false;
        }

        // check whether each line has numbers 1 to 9, check 9 times totally;
        for (int i = 0; i < 9; i++) {
            int[] column = new int[9];
            for (int j = 0; j < 9; j++) {
                column[j] = grid[j][i];
            }

            if (!is1To9(column)) {
                return false;
            }
        }

        // Check whether each 3-by-3 box has numbers 1-9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int counter = 0;
                int[] list = new int[9];

                for (int row = i * 3; row < i * 3 + 3; row++) { // row 0-3 3-6 6-9
                    for (int line = j * 3; line < j * 3 + 3; line++) {
                        list[counter++] = grid[row][line];
                    }
                }

                if (!is1To9(list))
                    return false;
            }
        }

        return true;
    }

    /**
     * Check whether each row has 1-9, return true if has, otherwise;
     *
     * @param eachRow an array of each row
     * @return whether each row has 1 to 9
     */
    private static boolean is1To9(int[] eachRow) {
        int[] temp = new int[eachRow.length];
        System.arraycopy(eachRow, 0, temp, 0, eachRow.length);

        // Sort temp array, makes it ordered;
        java.util.Arrays.sort(temp);

        for (int i = 0; i < 9; i++) {
            if (temp[i] != i + 1)
                return false;
        }

        // default return;
        return true;
    }
}
