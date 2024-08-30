package Basics;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datedemo {
    public static void main(String[] args) throws ParseException {


        String input = "08/26/2020 7:28";

        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date journeyDate = df.parse(input);
        System.out.println(journeyDate);


        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,-3);

        Date lastDate = calendar.getTime();
        System.out.println(lastDate);

        System.out.println(journeyDate.getMonth());
        System.out.println(lastDate.getMonth());

        if(journeyDate.getMonth() == lastDate.getMonth()){
            System.out.println("last");
        } else if(journeyDate.getMonth() == lastDate.getMonth()+1){
            System.out.println("second last");
        }else if(journeyDate.getMonth() == lastDate.getMonth()+2){
            System.out.println("third last");}
        else{
            System.out.println("current");
        }

        if((journeyDate.compareTo(lastDate)) > 0){
            System.out.println("After");
        }else
            System.out.println("Before");




    }
/*
    private static Date StringtoDate(String input) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        //Parsing the given String to Date object
        Date date = formatter.parse(input);
        System.out.println("Date object value: "+date);
        return date;
    }*/
}
