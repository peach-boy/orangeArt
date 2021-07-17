package com.orangeart.web;

import com.orangeart.protocal.ApiResponse;
import com.orangeart.protocal.Pagination;
import com.orangeart.protocal.model.CourseOrderVO;
import com.orangeart.protocal.model.StudentVO;
import com.orangeart.protocal.request.CreateCourseOrderRequest;
import com.orangeart.protocal.request.FindCourseOrderRequest;
import com.orangeart.service.CourseOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @Description: 课程订单相关
 * @Auther: ThomasWu
 * @Date: 2019/8/29 20:48
 * @Email:1414924381@qq.com
 */
@Api("课程订单相关")
@RestController
@RequestMapping(path = "/course_order")
public class CourseOrderController {


    @Resource
    private CourseOrderService courseOrderService;

    @ApiOperation(value = "课件订单查询", notes = "find")
    @GetMapping("/find")
    public ApiResponse<Pagination<CourseOrderVO>> find(FindCourseOrderRequest request) {
        return ApiResponse.success(courseOrderService.find(request));
    }


    @ApiOperation(value = "录入课程订单", notes = "create")
    @PostMapping("/create")
    public ApiResponse<Boolean> create(CreateCourseOrderRequest request) {
        return ApiResponse.success(courseOrderService.create(request));
    }
}
