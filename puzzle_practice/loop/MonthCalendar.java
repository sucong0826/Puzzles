package puzzle_practice.loop;

import puzzle_practice.choose.ZellerConsistency;

/**
 * Created by SuCong on 2015/09/22.
 */
public class MonthCalendar {
    private int year;
    private int month;
    private int day;

    public MonthCalendar(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Print title of this calendar;
     */
    public void printCalendarTitle() {
        System.out.println("               " + convertMonthToString() + " " + year + "               ");
        System.out.println("----------------------------------------------");
        String[] weeks = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (String week : weeks)
            System.out.print(week + "    ");
    }

    public void printCalendarBody() {
        ZellerConsistency zc = new ZellerConsistency(this.year, this.month, this.day);
        int dayInWeek = zc.getDayInWeek();
        int startDay = 1;
        int endDay = zc.getDaysOneMonth(this.year, this.month);

        int whichDay;
        switch (dayInWeek) {
            case 0:
                whichDay = 6;
                break;
            case 1:
                whichDay = 0;
                break;
            case 2:
                whichDay = 1;
                break;
            case 3:
                whichDay = 2;
                break;
            case 4:
                whichDay = 3;
                break;
            case 5:
                whichDay = 4;
                break;
            case 6:
                whichDay = 5;
                break;
            default:
                whichDay = -1;
                break;
        }

        for (int i = 0; i < 7; i++) {
            if (i < whichDay) {
                System.out.print("       ");
            } else {
                System.out.print(startDay++ + "      ");
                if (i == 6)
                    System.out.println();
            }
        }

        int counter = 0;
        for (int i = startDay; i < endDay + 1; i++) {
            if (i < 10) {
                System.out.print(i + "      ");
            } else {
                System.out.print(i + "     ");
            }

            counter++;

            if (counter % 7 == 0) {
                System.out.println();
            }
        }
    }

    /**
     * Convert integer to string;
     *
     * @return string of month
     */
    private String convertMonthToString() {
        switch (this.month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                throw new IllegalArgumentException("No this month");
        }
    }
}