package com.example.graduationdesign.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 提交记录表
 * @TableName submissions
 */
@TableName(value ="submissions")
@Data
public class Submissions implements Serializable {
    /**
     * 提交记录ID，主键，自增
     */
    @TableId(type = IdType.AUTO)
    private Integer submissionId;

    /**
     * 用户ID，外键，关联用户表
     */
    private Integer userId;

    /**
     * 题目ID，外键，关联题目表
     */
    private Integer problemId;

    /**
     * 提交的代码内容
     */
    private String code;

    /**
     * 代码编程语言
     */
    private String language;

    /**
     * 评测状态
     */
    private Object status;

    /**
     * 提交时间
     */
    private Date createdAt;

    /**
     * 代码执行时间
     */
    private BigDecimal executionTime;

    /**
     * 代码运行使用的内存
     */
    private Integer memoryUsed;

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
        Submissions other = (Submissions) that;
        return (this.getSubmissionId() == null ? other.getSubmissionId() == null : this.getSubmissionId().equals(other.getSubmissionId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getProblemId() == null ? other.getProblemId() == null : this.getProblemId().equals(other.getProblemId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getExecutionTime() == null ? other.getExecutionTime() == null : this.getExecutionTime().equals(other.getExecutionTime()))
            && (this.getMemoryUsed() == null ? other.getMemoryUsed() == null : this.getMemoryUsed().equals(other.getMemoryUsed()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSubmissionId() == null) ? 0 : getSubmissionId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getProblemId() == null) ? 0 : getProblemId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getExecutionTime() == null) ? 0 : getExecutionTime().hashCode());
        result = prime * result + ((getMemoryUsed() == null) ? 0 : getMemoryUsed().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", submissionId=").append(submissionId);
        sb.append(", userId=").append(userId);
        sb.append(", problemId=").append(problemId);
        sb.append(", code=").append(code);
        sb.append(", language=").append(language);
        sb.append(", status=").append(status);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", executionTime=").append(executionTime);
        sb.append(", memoryUsed=").append(memoryUsed);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}