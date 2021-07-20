package com.orangeart.domain.model;

import lombok.Data;

import java.sql.Time;

/**
 * 科目
 */
@Data
public class SubjectDO extends BaseDO {
    private Integer id;

    private String subjectName;

}
