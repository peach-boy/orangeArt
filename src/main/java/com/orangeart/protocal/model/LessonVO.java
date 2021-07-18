package com.orangeart.protocal.model;

import lombok.Data;

import java.util.Date;

@Data
public class LessonVO {
    private Integer id;

    private Integer studentId;

    private String studentName;

    private String className;

    private String coursewareName;

    private String studentPaintingUrl;

    private Date classTime;

    private Integer status;

    private Integer type;
}
