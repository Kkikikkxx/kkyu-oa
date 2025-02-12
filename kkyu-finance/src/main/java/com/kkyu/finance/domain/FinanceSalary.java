package com.kkyu.finance.domain;

import com.kkyu.common.annotation.Excel;
import com.kkyu.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;


/**
 * 薪资管理对象 finance_salary
 *
 * @author kkyu
 */
public class FinanceSalary extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 员工ID
     */
    @Excel(name = "员工ID")
    private Long employeeId;

    /**
     * 基本工资
     */
    @Excel(name = "基本工资")
    private BigDecimal baseSalary;

    /**
     * 奖金
     */
    @Excel(name = "奖金")
    private BigDecimal bonus;

    /**
     * 扣除项
     */
    @Excel(name = "扣除项")
    private BigDecimal deductions;

    /**
     * 实发工资
     */
    @Excel(name = "实发工资")
    private BigDecimal netSalary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(BigDecimal baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public BigDecimal getDeductions() {
        return deductions;
    }

    public void setDeductions(BigDecimal deductions) {
        this.deductions = deductions;
    }

    public BigDecimal getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(BigDecimal netSalary) {
        this.netSalary = netSalary;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("employeeId", getEmployeeId())
                .append("baseSalary", getBaseSalary())
                .append("bonus", getBonus())
                .append("deductions", getDeductions())
                .append("netSalary", getNetSalary())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .toString();
    }
}
