package com.example.graduationdesign.domain.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
@Data
public class ProblemsVO {
    /**
     * 题目ID，主键，自增
     */
    private Integer problemId;

    /**
     * 题目标题
     */
    private String title;

    /**
     * 题目描述
     */
    private String description;

    /**
     * 输入格式说明
     */
    private String inputFormat;

    /**
     * 输出格式说明
     */
    private String outputFormat;

    /**
     * 示例输入
     */
    private String exampleInput;

    /**
     * 示例输出
     */
    private String exampleOutput;

    /**
     * 题目难度等级
     */
    private Object difficulty;
//
//        @TableField(exist = false)
//        private static final long serialVersionUID = 1L;


}