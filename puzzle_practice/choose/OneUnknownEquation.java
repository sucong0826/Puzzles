package puzzle_practice.choose;

/**
 * 一元二次方程组的解法(java)
 * 在HelloWord中测试;
 * <p>
 * Created by SuCong on 2015/09/18.
 */
public class OneUnknownEquation {
    /**
     * 标准的表达式--用于输出
     */
    private String standardEquation;

    // 都是表达式中的各项参数
    private int a;
    private int b;
    private int c;

    public OneUnknownEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * 构建一个字符串的标准表达式。
     * ax^2 + bx + c = 0;
     *
     * @return 一个标准表达式的字符串
     */
    public String buildStandardEquation() {
        standardEquation = String.valueOf(a) + "x^2 + " + String.valueOf(b) + "x + " + String.valueOf(c) + " = 0";
        return standardEquation;
    }

    /**
     * 判断这个二元一次方程是否有根；
     * 判定标准 b^2 - 4ac;
     *
     * @return 是否有根, 有几个根
     */
    public int isEquationHasRoots() {
        int result = b * b - 4 * a * c;
        if (result > 0) return 2;
        else if (result == 0) return 1;
        else return 0;
    }

    /**
     * 计算每一个根的结果是多少;
     *
     * @param roots 有几个根
     * @return 根的结果
     */
    public double[] getEachRoot(int roots) {
        switch (roots) {
            case 0:
                return null;

            case 1:
                return new double[]{(double) (b - 2 * b) / (2 * a)};

            case 2:
                double rootPositive = ((((double) (b - 2 * b))) + Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
                double rootNegative = ((((double) (b - 2 * b))) - Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
                return new double[]{rootNegative, rootPositive};

            default:
                return null;
        }
    }

    /**
     * 输出想要的结果;
     */
    public void printResult() {
        String resStr = "";
        if (isEquationHasRoots() > 0) {
            for (int i = 0; i < getEachRoot(isEquationHasRoots()).length; i++) {
                resStr += getEachRoot(isEquationHasRoots())[i] + " ";
            }
        } else {
            resStr = "没有根！";
        }

        String str1 = "该二元一次方程是: " + this.buildStandardEquation();
        String str2 = "该方程有几个根: " + this.isEquationHasRoots();
        String str3 = "这些根分别是: " + resStr;
        System.out.println(str1 + "\n" + str2 + "\n" + str3);
    }

    public String getStandardEquation() {
        return standardEquation;
    }

    public void setStandardEquation(String standardEquation) {
        this.standardEquation = standardEquation;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
