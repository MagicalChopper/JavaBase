package com.coder.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期格式转化工具类
 */
public class DateUtil {
    public static String F1 = "yyyy-MM-dd HH:mm:ss";
    public static String F2 = "yyyy年-MM月-dd日 hh时mm秒ss秒";

    /**
     * 以F1格式为例，当前时间转换为字符串F1格式
     * @return String
     */
    public static String F1NowStrFormat() {
        SimpleDateFormat sdf = new SimpleDateFormat(F1);
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        String f1Format = sdf.format(date);
        return f1Format;
    }

    /**
     * 以F1的格式为例，根据传入Date格式化为String类型
     * @param date
     * @return
     */
    public static String F1DateToStrFormat(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(F1);
        Calendar calendar = Calendar.getInstance();
        String f1Format = sdf.format(date);
        return f1Format;
    }

    /**
     * 以String类型转换为Date
     * @param strDate
     * @return
     */
    public static Date F1StrToDateFormat(String strDate) {
        SimpleDateFormat sdf = new SimpleDateFormat(F1);
        Date date = null;

        try {
            date = sdf.parse(strDate);
        } catch (ParseException var4) {
            var4.printStackTrace();
        }

        return date;
    }

    /**
     * 由long类型的时间戳转换为Date类型
     * 时间戳：即指格林威治时间1970年01月01日00时00分00秒
     * (北京时间1970年01月01日08时00分00秒)起至现在的总秒数。
     * @param time
     * @return
     */
    public static Date longToDate(long time) {
        Date date = new Date(time);
        return date;
    }

}
