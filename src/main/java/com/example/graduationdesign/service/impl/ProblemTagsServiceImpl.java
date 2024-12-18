package com.example.graduationdesign.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.graduationdesign.domain.pojo.ProblemTags;
import com.example.graduationdesign.service.ProblemTagsService;
import com.example.graduationdesign.mapper.ProblemTagsMapper;
import org.springframework.stereotype.Service;

/**
* @author 王鑫焱
* @description 针对表【problem_tags(题目标签关联表)】的数据库操作Service实现
* @createDate 2024-11-01 11:51:09
*/
@Service
public class ProblemTagsServiceImpl extends ServiceImpl<ProblemTagsMapper, ProblemTags>
    implements ProblemTagsService{

}




