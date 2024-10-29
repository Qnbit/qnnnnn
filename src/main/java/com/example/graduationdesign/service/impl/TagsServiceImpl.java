package com.example.graduationdesign.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.graduationdesign.pojo.Tags;
import com.example.graduationdesign.service.TagsService;
import com.example.graduationdesign.mapper.TagsMapper;
import org.springframework.stereotype.Service;

/**
* @author 王鑫焱
* @description 针对表【tags(标签表)】的数据库操作Service实现
* @createDate 2024-10-29 17:21:40
*/
@Service
public class TagsServiceImpl extends ServiceImpl<TagsMapper, Tags>
    implements TagsService{

}




