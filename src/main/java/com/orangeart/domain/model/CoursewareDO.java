package com.orangeart.domain.model;

import lombok.Data;

/**
 * 课件表
 */
@Data
public class CoursewareDO extends BaseDO {
    private String coursewareName;

    private String fileUrl;

    private String remark;


}
