package com.orangeart.domain.model;

import io.swagger.models.auth.In;
import lombok.Data;

import java.sql.Time;
import java.util.Date;

/**
 * 班级表
 */
@Data
public class ClassDO extends BaseDO {
    private Integer id;

    private Integer weekDay;

    private Time beginTime;

    private Time endTime;

    private Integer subjectId;

    private String remark;

    private Integer status;

    private Integer type;

}
