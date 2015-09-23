import puzzle_practice.choose.OneUnknownEquation;
import puzzle_practice.choose.PointInTriangle;
import puzzle_practice.choose.ZellerConsistency;
import puzzle_practice.loop.*;

public class HelloWorld {

    public static void main(String[] args) {
        // OneUnknownEquation 测试结果
        OneUnknownEquation equation = new OneUnknownEquation(1, 12, 10);
        equation.printResult();

        // 泽勒一致性来计算日期的；
        new ZellerConsistency(2015, 9, 18);

        int[] pX = {2, 3};
        int[] pY = {-1, 5};
        int[] pZ = {7, 4};
        PointInTriangle pointInTriangle = new PointInTriangle(pX, pY, pZ);
        System.out.println(pointInTriangle.isPointInTriangle(new int[]{6, 3}) + "");

        // 找到一个数的所有乘积因子
        FindFactors findFactors = new FindFactors(40);
        int[] resultArray = findFactors.getFactors();
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);
        }

        // 打印金字塔1
        AllTowers.printTowerOne(10);
        AllTowers.printTowerTwo(6);
        AllTowers.printTowerThree(6);
        AllTowers.printTowerFour(8);

        // 打印日历
        MonthCalendar monthCalendar = new MonthCalendar(2014, 9, 1);
        monthCalendar.printCalendarTitle();
        System.out.println();
        monthCalendar.printCalendarBody();

        RockPaperScissors rps = new RockPaperScissors();
        rps.getResult(3);

        DecimalToBinary decimalToBinary = new DecimalToBinary(76);
        System.out.println(decimalToBinary.convertDecimalToBinaryString());
    }
}
