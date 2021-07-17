package com.orangeart.domain.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 课程订单表
 */
public class CourseOrderDO extends BaseDO {
    private Integer studentId;

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
