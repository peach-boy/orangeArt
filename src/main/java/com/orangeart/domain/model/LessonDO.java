package com.orangeart.domain.model;

import io.swagger.models.auth.In;

import java.util.Date;

/**
 * 课时表
 */
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

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseOrderId() {
        return courseOrderId;
    }

    public void setCourseOrderId(Integer courseOrderId) {
        this.courseOrderId = courseOrderId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getCoursewareId() {
        return coursewareId;
    }

    public void setCoursewareId(Integer coursewareId) {
        this.coursewareId = coursewareId;
    }

    public String getStudentPaintingUrl() {
        return studentPaintingUrl;
    }

    public void setStudentPaintingUrl(String studentPaintingUrl) {
        this.studentPaintingUrl = studentPaintingUrl;
    }

    public Date getClassTime() {
        return classTime;
    }

    public void setClassTime(Date classTime) {
        this.classTime = classTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
