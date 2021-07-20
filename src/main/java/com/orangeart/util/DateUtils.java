package com.orangeart.util;

import com.orangeart.exception.BusinessRuntimeException;
import com.orangeart.exception.ErrorCode;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

public class DateUtils {

    public static Date parseToDate(String str, String pattarn) {
        try {
            return org.apache.commons.lang3.time.DateUtils.parseDate(str, pattarn);
        } catch (Exception e) {
            throw new BusinessRuntimeException(ErrorCode.DATE_PARSE_ERROR);
        }
    }

    public static String parseDateToStr(Date date, String pattern) {
        return date == null ? "" : DateFormatUtils.format(date, pattern);
    }
}
