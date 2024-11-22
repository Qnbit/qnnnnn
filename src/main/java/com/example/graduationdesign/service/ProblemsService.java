package com.example.graduationdesign.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.graduationdesign.domain.pojo.Problems;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 王鑫焱
* @description 针对表【problems(题目表)】的数据库操作Service
* @createDate 2024-10-29 17:21:40
*/
public interface ProblemsService extends IService<Problems> {

        IPage<Problems> getProblemsPage(int pageNum, int pageSize, String title) ;


}
