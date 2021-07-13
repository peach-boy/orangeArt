package com.orangeart.web;

import com.orangeart.protocal.ApiResponse;
import com.orangeart.protocal.Pagination;
import com.orangeart.protocal.model.StudentVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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


    @ApiOperation(value = "课件查询", notes = "find")
    @GetMapping("/find")
    public ApiResponse<Pagination<StudentVO>> find() {
        return null;
    }


    @ApiOperation(value = "录入课件", notes = "create")
    @PostMapping("/create")
    public ApiResponse<Boolean> create() {
        return null;
    }
}
