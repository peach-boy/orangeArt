package com.orangeart.constant;

import com.orangeart.exception.BusinessRuntimeException;
import com.orangeart.exception.ErrorCode;

import java.util.Objects;

/**
 * 学员状态
 */
public enum WeekDayEnum {
    MONDAY(1, "周一"),
    TUESDAY(2, "周二"),
    WEDNESDAY(3, "周三"),
    THURSDAY(4, "周四"),
    FRIDAY(5, "周五"),
    SATURDAY(6, "周六"),
    SUNDAY(7, "周天"),
    ;

    private Integer code;

    private String desc;


    WeekDayEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static WeekDayEnum getByCode(Integer code) {
        for (WeekDayEnum weekDayEnum : WeekDayEnum.values()) {
            if (Objects.equals(code,weekDayEnum.getCode())) {
                return weekDayEnum;
            }
        }
        throw new BusinessRuntimeException(ErrorCode.SYSTEM_ERROR);
    }


    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
