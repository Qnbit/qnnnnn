package com.example.graduationdesign.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.graduationdesign.domain.pojo.Problems;
import com.example.graduationdesign.service.ProblemsService;
import com.example.graduationdesign.mapper.ProblemsMapper;
import org.springframework.stereotype.Service;

/**
* @author 王鑫焱
* @description 针对表【problems(题目表)】的数据库操作Service实现
* @createDate 2024-10-29 17:21:40
*/
@Service
public class ProblemsServiceImpl extends ServiceImpl<ProblemsMapper, Problems>
    implements ProblemsService{

        @Override
        public IPage<Problems> getProblemsPage(int pageNum, int pageSize, String title) {
            // 创建分页对象，传入当前页码和每页数量
            Page<Problems> page = new Page<>(pageNum, pageSize);
            // 创建查询条件
            LambdaQueryWrapper<Problems> queryWrapper = new LambdaQueryWrapper<>();
            queryWrapper.like(title != null, Problems::getTitle, title); // 条件查询
            // 执行分页查询并返回分页结果
            return this.page(page, queryWrapper);
        }


}




