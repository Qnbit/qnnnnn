package com.example.graduationdesign.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.graduationdesign.pojo.Users;
import com.example.graduationdesign.service.UsersService;
import com.example.graduationdesign.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
* @author 王鑫焱
* @description 针对表【users(用户表)】的数据库操作Service实现
* @createDate 2024-10-29 17:21:40
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

}




