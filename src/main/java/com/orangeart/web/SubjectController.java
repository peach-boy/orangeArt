package com.orangeart.web;

import com.orangeart.protocal.ApiResponse;
import com.orangeart.protocal.Pagination;
import com.orangeart.protocal.model.ClassCascaderItem;
import com.orangeart.protocal.model.ClassVO;
import com.orangeart.protocal.model.SubjectVO;
import com.orangeart.protocal.request.CreateClassRequest;
import com.orangeart.protocal.request.FindClassRequest;
import com.orangeart.service.ClassService;
import com.orangeart.service.SubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
 * @Description: 科目相关
 * @Auther: ThomasWu
 * @Date: 2019/8/29 20:48
 * @Email:1414924381@qq.com
 */
@Api("科目相关")
@RestController
@RequestMapping(path = "/subject")
public class SubjectController {

    @Resource
    private SubjectService subjectService;


    @ApiOperation(value = "新增科目", notes = "create")
    @PostMapping("/create")
    public ApiResponse<Boolean> create(@RequestParam String subjectName) {
        return ApiResponse.success(subjectService.create(subjectName));
    }

    @ApiOperation(value = "查询所有科目", notes = "getAll")
    @GetMapping("/getAll")
    public ApiResponse<List<SubjectVO>> find() {
        return ApiResponse.success(subjectService.getAll());
    }
}
