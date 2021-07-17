package com.orangeart.service;

import com.google.common.collect.Lists;
import com.orangeart.constant.StatusEnum;
import com.orangeart.domain.dao.CourseOrderMapper;
import com.orangeart.domain.dao.StudentMapper;
import com.orangeart.domain.model.CourseOrderDO;
import com.orangeart.domain.model.StudentDO;
import com.orangeart.exception.BusinessRuntimeException;
import com.orangeart.exception.ErrorCode;
import com.orangeart.protocal.Pagination;
import com.orangeart.protocal.model.CourseOrderVO;
import com.orangeart.protocal.request.CreateCourseOrderRequest;
import com.orangeart.protocal.request.CreateStudentRequest;
import com.orangeart.protocal.request.FindCourseOrderRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: 课程订单相关
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:21
 * @Email:1414924381@qq.com
 */
@Service
public class CourseOrderService {

    @Resource
    private CourseOrderMapper courseOrderMapper;

    @Resource
    private StudentMapper studentMapper;

    public Pagination<CourseOrderVO> find(FindCourseOrderRequest request) {
        if (StringUtils.isNoneBlank(request.getStudentName())) {
            StudentDO studentDO = studentMapper.getByName(request.getStudentName());
            if (studentDO != null) {
                request.setStudentId(studentDO.getId());
            }
        }


        int count = courseOrderMapper.findCount(request);
        if (count == 0) {
            return new Pagination<>(0, Lists.newArrayList(), request);
        }

        List<CourseOrderDO> courseOrderDOList = courseOrderMapper.find(request);
        List<CourseOrderVO> courseOrderVOList = courseOrderDOList.stream().map(courseOrderDO -> {
            CourseOrderVO courseOrderVO = new CourseOrderVO();

            StudentDO studentDO = studentMapper.getById(courseOrderDO.getStudentId());
            courseOrderVO.setStudentName(studentDO.getName());
            courseOrderVO.setTotalQuantity(courseOrderDO.getTotalQuantity());
            courseOrderVO.setUsedQuantity(courseOrderDO.getUsedQuantity());
            courseOrderVO.setRemainQuantity(courseOrderDO.getRemainQuantity());
            courseOrderVO.setOrderTime(courseOrderDO.getOrderTime());
            courseOrderVO.setTotalAmt(courseOrderDO.getTotalAmt());
            return courseOrderVO;
        }).collect(Collectors.toList());


        return new Pagination<>(count, courseOrderVOList, request);
    }

    public Boolean create(CreateCourseOrderRequest request) {
        StudentDO studentDO = studentMapper.getByName(request.getStudentName());
        if (studentDO == null) {
            throw new BusinessRuntimeException(ErrorCode.STUDENT_NOT_EXSIT);
        }

        CourseOrderDO courseOrderDO = new CourseOrderDO();
        courseOrderDO.setStudentId(studentDO.getId());
        courseOrderDO.setOrderTime(new Date());
        courseOrderDO.setTotalQuantity(request.getTotalQuantity());
        courseOrderDO.setRemainQuantity(request.getTotalQuantity());
        courseOrderDO.setUsedQuantity(0);
        courseOrderDO.setPayChannel(request.getPayChannel());
        courseOrderDO.setTotalAmt(request.getTotalAmt());
        courseOrderDO.setStatus(StatusEnum.YES.getStatus());
        courseOrderMapper.insert(courseOrderDO);
        return Boolean.TRUE;
    }

}
