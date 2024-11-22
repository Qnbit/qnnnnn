package com.example.graduationdesign.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.graduationdesign.common.QN;
import com.example.graduationdesign.domain.pojo.Problems;
import com.example.graduationdesign.service.ProblemsService;
//import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Objects;

//@Api(value = "题目管理")
@Tag(name = "题目管理")
@RequiredArgsConstructor
@RequestMapping("/problem")
@RestController
public class ProblemController {

//    @Autowired
    // TODO: 题目管理Controller
    private final ProblemsService problemsService;

//    //把DTO拷贝到pojo
//    User user=BeanUtil.copyProperties(userDTO,User.class);
//    //把pojo拷贝到VO
//    BeanUtil.copyToList(users,UserVO.class);

//    @GetMapping("/selectProblems")
//    public QN<IPage<Problems>> selectProblems(@RequestParam Problems problems) {
////        public QN<IPage<Map<String, Object>>> selectProblems(@RequestParam Problems problems) {
////        LambdaQueryWrapper <Problems> problemsLambdaQueryWrapper = new QueryWrapper<Problems>().lambda();
//        LambdaQueryWrapper <Problems> problemsLambdaQueryWrapper = Wrappers.<Problems>lambdaQuery();
//        problemsLambdaQueryWrapper
//                            .like(problems.getProblemId()!=null,Problems::getProblemId,problems.getProblemId())
//                            .like(problems.getTitle()!=null,Problems::getTitle,problems.getTitle())
////                            .like(problems.getTitle()!=null,Problems::getTitle,problems.getTitle())
//                            .orderByAsc(Problems::getProblemId);
////        IPage<Problems> problemsPage = new IPage<Problems>(1, 1);
//        IPage<Problems> page = new Page<Problems>(1,1);
//        IPage<Map<String, Object>> resultPage = problemsService.page(page, problemsLambdaQueryWrapper);
//        // 返回自定义响应格式
//        return QN.success(resultPage);
////        return QN.success(problemsService.pageMaps(page,problemsLambdaQueryWrapper));
////        return null;
//    }


        /**
         * 获取问题分页列表
         * @param pageNum 当前页
         * @param pageSize 每页大小
         * @param title 问题标题
         * @return 问题分页数据
         */
        @GetMapping("/problemsq")
        public IPage<Problems> getProblems(@RequestParam(defaultValue = "1") int pageNum,
                                           @RequestParam(defaultValue = "10") int pageSize,
                                           @RequestParam(required = false) String title) {
            return problemsService.getProblemsPage(pageNum, pageSize, title);
        }




}
