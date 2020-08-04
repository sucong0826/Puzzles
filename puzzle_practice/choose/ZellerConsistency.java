package puzzle_practice.choose;

/**
 * Zeller Consistency泽勒一致性问题用于计算某天是星期几的一个科学计算公式。
 * <p>
 * Created by SuCong on 2015/09/18.
 */
public class ZellerConsistency {
    /**
     * How many days in one month;
     */
    private int q;

    /**
     * Which month in one year;
     */
    private int m;

    /**
     * Which century;
     */
    private int j;

    /**
     * The years of current century;
     */
    private int k;

    public ZellerConsistency(int year, int month, int day) {
        this.m = month;
        changeM();

        this.q = day;
        this.j = (int) this.getCentury(year);
        this.k = this.getCenturyYears(year);

        int weekDay = getDayInWeek();
        String result = "";
        switch (weekDay) {
            case 0:
                result = "星期六";
                break;
            case 1:
                result = "星期天";
                break;
            case 2:
                result = "星期一";
                break;
            case 3:
                result = "星期二";
                break;
            case 4:
                result = "星期三";
                break;
            case 5:
                result = "星期四";
                break;
            case 6:
                result = "星期五";
                break;
        }
        System.out.println("今天是: " + result);
    }

    /**
     * Is current a leap year;
     *
     * @param year input year
     * @return is this year a leap year
     */
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    /**
     * How many days in each month;
     *
     * @return how many days in one month;
     */
    @SuppressWarnings("unused")
    public int getDaysOneMonth(int year, int month) {
        switch (month) {
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            case 13:
                return 31;
            case 14:
                return isLeapYear(year - 1) ? 28 : 29;
            default:
                return 0;
        }
    }

    private int changeM() {
        if (m == 1) {
            m = 13;
        } else if (m == 2) {
            m = 14;
        }

        return this.m;
    }

    /**
     * 获取当前年数在那个世纪；
     *
     * @return 当前年数是什么世纪
     */
    private long getCentury(int year) {
        return Math.round((double) year / 100);
    }

    /**
     * 获取当前世纪的年;
     *
     * @param year current year
     * @return 返回当前世纪的年数
     */
    private int getCenturyYears(int year) {
        return year % 100;
    }

    /**
     * 返回一星期中是哪一天；
     *
     * @return 一星期中的哪天
     */
    public int getDayInWeek() {
        return (q + 26 * (int) ((double) (m + 1) / 10) + k + (int) ((double) k / 4)
                + (int) ((double) j / 4) + 5 * j) % 7;
    }
}
