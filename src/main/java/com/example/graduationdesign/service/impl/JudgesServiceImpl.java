package com.example.graduationdesign.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.graduationdesign.pojo.Judges;
import com.example.graduationdesign.service.JudgesService;
import com.example.graduationdesign.mapper.JudgesMapper;
import org.springframework.stereotype.Service;

/**
* @author 王鑫焱
* @description 针对表【judges(评测结果表)】的数据库操作Service实现
* @createDate 2024-10-29 17:21:40
*/
@Service
public class JudgesServiceImpl extends ServiceImpl<JudgesMapper, Judges>
    implements JudgesService{

}




