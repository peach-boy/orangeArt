package com.orangeart.domain.model;

import lombok.Data;

import java.sql.Time;
import java.util.Date;

/**
 * 班级表
 */
@Data
public class ClassDO extends BaseDO {
    private Integer weekDay;

    private Time beginTime;

    private Time endTime;

    private Integer subjectId;

    private String remark;

    private Integer status;


}
