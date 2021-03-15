package com.orangeart.web;

import com.orangeart.domain.entity.StudentDO;
import com.orangeart.protocal.ApiResponse;
import com.orangeart.protocal.PageRequest;
import com.orangeart.protocal.Pagination;
import com.orangeart.protocal.model.StudentVO;
import com.orangeart.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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


    @ApiOperation(value = "查询", notes = "list")
    @GetMapping("/list")
    public ApiResponse<Pagination<StudentVO>> list(PageRequest request) {
        return ApiResponse.success(studentService.list(request));
    }

}
