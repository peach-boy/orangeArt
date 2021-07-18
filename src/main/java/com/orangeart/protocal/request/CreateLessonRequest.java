package com.orangeart.protocal.request;

import lombok.Data;


@Data
public class CreateLessonRequest {
    private String studentName;

    private Integer classId;

    private Integer coursewareId;

    private String classTime;

    private Integer type;

    private Integer subjectId;
}
