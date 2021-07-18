package com.orangeart.web;

import com.orangeart.protocal.ApiResponse;
import com.orangeart.protocal.Pagination;
import com.orangeart.protocal.model.ClassCascaderItem;
import com.orangeart.protocal.model.ClassVO;
import com.orangeart.protocal.model.StudentVO;
import com.orangeart.protocal.request.CreateClassRequest;
import com.orangeart.protocal.request.CreateStudentRequest;
import com.orangeart.protocal.request.FindClassRequest;
import com.orangeart.protocal.request.FindStudentRequest;
import com.orangeart.service.ClassService;
import com.orangeart.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * @Description: 班级相关
 * @Auther: ThomasWu
 * @Date: 2019/8/29 20:48
 * @Email:1414924381@qq.com
 */
@Api("班级相关")
@RestController
@RequestMapping(path = "/class")
public class ClassController {

    @Resource
    private ClassService classService;

    @ApiOperation(value = "查询所有班级", notes = "find")
    @GetMapping("/find")
    public ApiResponse<Pagination<ClassVO>> find(FindClassRequest request) {
        return ApiResponse.success(classService.find(request));
    }


    @ApiOperation(value = "录入班级", notes = "create")
    @PostMapping("/create")
    public ApiResponse<Boolean> create(CreateClassRequest request) {
        return ApiResponse.success(classService.create(request));
    }

    @ApiOperation(value = "查询所有班级", notes = "getAll")
    @GetMapping("/getAll")
    public ApiResponse<List<ClassCascaderItem>> find() {
        return ApiResponse.success(classService.getAll());
    }
}
