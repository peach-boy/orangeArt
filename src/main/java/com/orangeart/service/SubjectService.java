package com.orangeart.service;

import com.orangeart.domain.dao.SubjectMapper;
import com.orangeart.domain.model.SubjectDO;
import com.orangeart.protocal.model.SubjectVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: 科目相关
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:21
 * @Email:1414924381@qq.com
 */
@Service
public class SubjectService {

    @Resource
    private SubjectMapper subjectMapper;


    public Boolean create(String subjectName) {
        subjectMapper.insert(subjectName);
        return Boolean.TRUE;
    }

    public SubjectVO getById(Integer subjectId) {
        SubjectDO subjectDO = subjectMapper.getById(subjectId);

        SubjectVO subjectVO = new SubjectVO();
        subjectVO.setId(subjectDO.getId());
        subjectVO.setSubjectName(subjectDO.getSubjectName());
        return subjectVO;
    }

    public List<SubjectVO> getAll() {
        List<SubjectDO> classDOList = subjectMapper.getAll();

        return classDOList.stream().map(subjectDO -> {
            SubjectVO subjectVO = new SubjectVO();
            subjectVO.setSubjectName(subjectDO.getSubjectName());
            subjectVO.setId(subjectDO.getId());
            return subjectVO;
        }).collect(Collectors.toList());
    }


}
