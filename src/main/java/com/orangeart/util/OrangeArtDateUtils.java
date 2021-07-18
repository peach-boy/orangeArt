package com.orangeart.util;

import com.orangeart.exception.BusinessRuntimeException;
import com.orangeart.exception.ErrorCode;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.util.Date;

public class OrangeArtDateUtils {

    public final static String TIME_PATTARN = "HH:mm:ss";

    public final static String DAY_PATTARN = "YYYY-MM-dd";

    public final static String DAY_TIME_PATTARN = "yyyy-MM-DD hh:mm:ss";


    public static Date parseStrToDate(String str, String pattarn) {
        try {
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            return DateUtils.parseDate(str, pattarn);
        } catch (ParseException e) {
            throw new BusinessRuntimeException(ErrorCode.SYSTEM_ERROR);
        }
    }


}
