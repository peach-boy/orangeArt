package com.orangeart.web;

import com.orangeart.protocal.ApiResponse;
import com.orangeart.protocal.Pagination;
import com.orangeart.protocal.model.LessonVO;
import com.orangeart.protocal.model.StudentVO;
import com.orangeart.protocal.request.CreateLessonRequest;
import com.orangeart.protocal.request.FindLessonRequest;
import com.orangeart.service.LessonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @Description: 课时相关
 * @Auther: ThomasWu
 * @Date: 2019/8/29 20:48
 * @Email:1414924381@qq.com
 */
@Api("课时相关")
@RestController
@RequestMapping(path = "/lesson")
public class LessonController {

    @Resource
    private LessonService lessonService;

    @ApiOperation(value = "课时查询", notes = "find")
    @GetMapping("/find")
    public ApiResponse<Pagination<LessonVO>> find(FindLessonRequest request) {
        return ApiResponse.success(lessonService.find(request));
    }


    @ApiOperation(value = "录入课时", notes = "create")
    @PostMapping("/create")
    public ApiResponse<Boolean> create(CreateLessonRequest request) {
        return ApiResponse.success(lessonService.create(request));
    }
}
