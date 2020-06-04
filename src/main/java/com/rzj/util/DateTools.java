package com.rzj.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTools {
    private static final Logger LOG = LogManager.getLogger(DateTools.class);

    public static String dateToString(Date date, String format) {
        DateFormat df = new SimpleDateFormat(format);
        String newDateString = null;
        try {
            newDateString = df.format(date);
        } catch (Exception e) {

        }
        return newDateString;
    }

    public static boolean belongCalendar(Date nowTime, Date beginTime, Date endTime) {
        //设置当前时间
        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);
        //设置开始时间
        Calendar begin = Calendar.getInstance();
        begin.setTime(beginTime);
        //设置结束时间
        Calendar end = Calendar.getInstance();
        end.setTime(endTime);
        //处于开始时间之后，和结束时间之前的判断
        if (date.after(begin) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }


    public static String checkDateDefSuffixForDataType() {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        Date nowTime =null;
        Date beginTime_mon = null;
        Date endTime_mon = null;
        Date beginTime_aft = null;
        Date endTime_aft = null;
        try {
            nowTime = df.parse(df.format(new Date()));
            beginTime_mon = df.parse("10:00:00");
            endTime_mon = df.parse("11:00:00");
            beginTime_aft = df.parse("15:00:00");
            endTime_aft = df.parse("16::00");
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean flag_am = DateTools.belongCalendar(nowTime, beginTime_mon, endTime_mon);
        boolean flag_pm = DateTools.belongCalendar(nowTime, beginTime_aft, endTime_aft);
        String dateTypeSuffix = "";
        if(flag_am){
            dateTypeSuffix = "_AM";
        }else if(flag_pm){
            dateTypeSuffix = "_PM";
        }
        return dateTypeSuffix;
    }


    public static void main(String[] args) {
        String a = checkDateDefSuffixForDataType();
        System.out.print(a);
    }


}
