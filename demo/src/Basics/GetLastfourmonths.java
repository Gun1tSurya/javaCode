package Basics;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class GetLastfourmonths {
    public static void main(String[] args) {
       getLastFourMonth();
        System.out.println(getMonthdata());
    }

    private static String getLastFourMonth() {
        YearMonth thismonth = YearMonth.now();
        DateTimeFormatter monthYearFormatter = DateTimeFormatter.ofPattern("MMMM yyyy");
        return thismonth.format(monthYearFormatter);
    }

    public static List<String> getMonthdata(){
        ArrayList list = new ArrayList();
        list.add("jan");
        list.add("feb");
        return list;
    }
}
