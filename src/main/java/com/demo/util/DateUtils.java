package com.demo.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author apple 16/9/24
 */
public class DateUtils {

  private static final SimpleDateFormat dateFormatToDay = new SimpleDateFormat("yyyy-MM-dd");

  private static Date getDayBeginTime(Date date) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.set(Calendar.HOUR, 0);
    calendar.set(Calendar.MINUTE, 0);
    calendar.set(Calendar.SECOND, 0);
    calendar.set(Calendar.MILLISECOND, 0);
    return new Date(calendar.getTime().getTime());
  }

  public static String getDateOffset(int offset) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new Date());
    calendar.add(calendar.DATE, offset);

    return dateFormatToDay.format(getDayBeginTime(calendar.getTime()));
  }


  public static void main(String[] args) {
    System.out.println((getDateOffset(-12)));
  }

}
