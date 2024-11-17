package com.example.graduationdesign.domain.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 评测结果表
 * @TableName judges
 */
@TableName(value ="judges")
@Data
public class Judges implements Serializable {
    /**
     * 评测结果ID，主键，自增
     */
    @TableId(type = IdType.AUTO)
    private Integer judgeId;

    /**
     * 提交记录ID，外键，关联提交记录表
     */
    private Integer submissionId;

    /**
     * 评测结果类型
     */
    private Object result;

    /**
     * 评测输出结果
     */
    private String output;

    /**
     * 评测时间
     */
    private Date createdAt;

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
        Judges other = (Judges) that;
        return (this.getJudgeId() == null ? other.getJudgeId() == null : this.getJudgeId().equals(other.getJudgeId()))
            && (this.getSubmissionId() == null ? other.getSubmissionId() == null : this.getSubmissionId().equals(other.getSubmissionId()))
            && (this.getResult() == null ? other.getResult() == null : this.getResult().equals(other.getResult()))
            && (this.getOutput() == null ? other.getOutput() == null : this.getOutput().equals(other.getOutput()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getJudgeId() == null) ? 0 : getJudgeId().hashCode());
        result = prime * result + ((getSubmissionId() == null) ? 0 : getSubmissionId().hashCode());
        result = prime * result + ((getResult() == null) ? 0 : getResult().hashCode());
        result = prime * result + ((getOutput() == null) ? 0 : getOutput().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", judgeId=").append(judgeId);
        sb.append(", submissionId=").append(submissionId);
        sb.append(", result=").append(result);
        sb.append(", output=").append(output);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}