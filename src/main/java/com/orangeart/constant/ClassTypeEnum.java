package com.orangeart.constant;

import com.orangeart.exception.BusinessRuntimeException;
import com.orangeart.exception.ErrorCode;

import java.util.Objects;

/**
 * 学员状态
 */
public enum ClassTypeEnum {
    WORK_DAY_CLASS(1, "平日班级"),
    SUMMER_CLASS(2, "暑假班级"),
    WINTER_CLASS(3, "寒假班级"),
    ;

    private Integer type;

    private String desc;


    ClassTypeEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public static ClassTypeEnum getByType(Integer code) {
        for (ClassTypeEnum classTypeEnum : ClassTypeEnum.values()) {
            if (Objects.equals(code,classTypeEnum.getType())) {
                return classTypeEnum;
            }
        }
        throw new BusinessRuntimeException(ErrorCode.SYSTEM_ERROR);
    }


    public Integer getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
