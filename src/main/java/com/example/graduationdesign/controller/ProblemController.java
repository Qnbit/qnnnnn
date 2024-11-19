package com.example.graduationdesign.controller;

import com.example.graduationdesign.common.QN;
import com.example.graduationdesign.domain.pojo.Problems;
import com.example.graduationdesign.service.ProblemsService;
//import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Api(value = "题目管理")
@Tag(name = "题目管理")
@RequiredArgsConstructor
@RequestMapping("/problem")
@RestController
public class ProblemController {

    @Autowired
    // TODO: 题目管理Controller
    ProblemsService problemsService;

    @GetMapping("/selectProblems")
    public QN<List<Problems>> selectProblems() {
        return QN.success(problemsService.list());
    }


}
