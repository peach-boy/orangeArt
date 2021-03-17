package com.orangeart.web;

import com.orangeart.protocal.ApiResponse;
import com.orangeart.protocal.Pagination;
import com.orangeart.protocal.model.StudentVO;
import com.orangeart.protocal.request.CreateStudentRequest;
import com.orangeart.protocal.request.FindStudentRequest;
import com.orangeart.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description: TODO
 * @Auther: ThomasWu
 * @Date: 2019/8/29 20:48
 * @Email:1414924381@qq.com
 */
@Api("学员相关")
@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @ApiOperation(value = "学员查询", notes = "find")
    @GetMapping("/find")
    public ApiResponse<Pagination<StudentVO>> find(FindStudentRequest request) {
        return ApiResponse.success(studentService.find(request));
    }


    @ApiOperation(value = "创建学员", notes = "create")
    @PostMapping("/create")
    public ApiResponse<Boolean> find(CreateStudentRequest request) {
        return ApiResponse.success(studentService.create(request));
    }
}
