package com.orangeart.protocal.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateCourseOrderRequest {
    private String studentName;

    private BigDecimal totalAmt;

    private Integer totalQuantity;

    private Integer payChannel;

}
