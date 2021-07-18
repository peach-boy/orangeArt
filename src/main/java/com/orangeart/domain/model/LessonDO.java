package com.orangeart.domain.model;

import lombok.Data;

import java.util.Date;

/**
 * 课时表
 */
@Data
public class LessonDO extends BaseDO{
    private Integer studentId;

    private Integer courseOrderId;

    private Integer subjectId;

    private Integer classId;

    private Integer coursewareId;

    private String studentPaintingUrl;

    private Date classTime;

    private Integer status;

    private Integer type;


}
