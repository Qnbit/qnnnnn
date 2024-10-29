package com.example.graduationdesign.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 题目表
 * @TableName problems
 */
@TableName(value ="problems")
@Data
public class Problems implements Serializable {
    /**
     * 题目ID，主键，自增
     */
    @TableId(type = IdType.AUTO)
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

    /**
     * 题目创建时间
     */
    private Date createdAt;

    /**
     * 题目更新时间
     */
    private Date updatedAt;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Problems other = (Problems) that;
        return (this.getProblemId() == null ? other.getProblemId() == null : this.getProblemId().equals(other.getProblemId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getInputFormat() == null ? other.getInputFormat() == null : this.getInputFormat().equals(other.getInputFormat()))
            && (this.getOutputFormat() == null ? other.getOutputFormat() == null : this.getOutputFormat().equals(other.getOutputFormat()))
            && (this.getExampleInput() == null ? other.getExampleInput() == null : this.getExampleInput().equals(other.getExampleInput()))
            && (this.getExampleOutput() == null ? other.getExampleOutput() == null : this.getExampleOutput().equals(other.getExampleOutput()))
            && (this.getDifficulty() == null ? other.getDifficulty() == null : this.getDifficulty().equals(other.getDifficulty()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProblemId() == null) ? 0 : getProblemId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getInputFormat() == null) ? 0 : getInputFormat().hashCode());
        result = prime * result + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        result = prime * result + ((getExampleInput() == null) ? 0 : getExampleInput().hashCode());
        result = prime * result + ((getExampleOutput() == null) ? 0 : getExampleOutput().hashCode());
        result = prime * result + ((getDifficulty() == null) ? 0 : getDifficulty().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", problemId=").append(problemId);
        sb.append(", title=").append(title);
        sb.append(", description=").append(description);
        sb.append(", inputFormat=").append(inputFormat);
        sb.append(", outputFormat=").append(outputFormat);
        sb.append(", exampleInput=").append(exampleInput);
        sb.append(", exampleOutput=").append(exampleOutput);
        sb.append(", difficulty=").append(difficulty);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}