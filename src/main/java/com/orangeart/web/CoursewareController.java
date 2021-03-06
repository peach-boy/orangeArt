package com.orangeart.web;

import com.orangeart.protocal.ApiResponse;
import com.orangeart.protocal.Pagination;
import com.orangeart.protocal.model.ClassCascaderItem;
import com.orangeart.protocal.model.CoursewareVO;
import com.orangeart.protocal.model.StudentVO;
import com.orangeart.protocal.request.CreateCoursewareRequest;
import com.orangeart.protocal.request.CreateStudentRequest;
import com.orangeart.protocal.request.FindStudentRequest;
import com.orangeart.service.CoursewareService;
import com.orangeart.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @Description: 课件相关
 * @Auther: ThomasWu
 * @Date: 2019/8/29 20:48
 * @Email:1414924381@qq.com
 */
@Api("课件相关")
@RestController
@RequestMapping(path = "/courseware")
public class CoursewareController {

    @Autowired
    private CoursewareService coursewareService;


    @ApiOperation(value = "课件查询", notes = "find")
    @GetMapping("/find")
    public ApiResponse<Pagination<StudentVO>> find() {
        return null;
    }


    @ApiOperation(value = "录入课件", notes = "create")
    @PostMapping("/create")
    public ApiResponse<Boolean> create(CreateCoursewareRequest request) {
        return ApiResponse.success(coursewareService.create(request));
    }

    @ApiOperation(value = "查询所有班级", notes = "getAll")
    @GetMapping("/getAll")
    public ApiResponse<List<CoursewareVO>> getAll() {
        return ApiResponse.success(coursewareService.getAll());
    }
}
