package com.example.graduationdesign.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.graduationdesign.pojo.Problems;
import com.example.graduationdesign.service.ProblemsService;
import com.example.graduationdesign.mapper.ProblemsMapper;
import org.springframework.stereotype.Service;

/**
* @author 王鑫焱
* @description 针对表【problems(题目表)】的数据库操作Service实现
* @createDate 2024-10-29 16:58:41
*/
@Service
public class ProblemsServiceImpl extends ServiceImpl<ProblemsMapper, Problems>
    implements ProblemsService{

}




