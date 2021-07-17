package com.orangeart.protocal.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CourseOrderVO {
    private Integer studentId;

    private String studentName;

    private BigDecimal totalAmt;

    private BigDecimal price;

    private Integer totalQuantity;

    private Integer usedQuantity;

    private Integer remainQuantity;

    private Integer payChannel;

    private Date orderTime;

    private Integer status;

    private Date overTime;
}
