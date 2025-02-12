package com.kkyu.finance.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.kkyu.common.annotation.Excel;
import com.kkyu.common.core.domain.BaseEntity;

/**
 * 薪资管理对象 finance_salary
 *
 * @author kkyu
 */
        public class FinanceSalary extends BaseEntity
        {
        private static final long serialVersionUID = 1L;

                /** 主键ID */
        private Long id;

                /** 员工姓名 */
                @Excel(name = "员工姓名")
        private String employeeName;

                /** 基本工资 */
                @Excel(name = "基本工资")
        private BigDecimal baseSalary;

                /** 奖金 */
                @Excel(name = "奖金")
        private BigDecimal bonus;

                /** 扣除项 */
                @Excel(name = "扣除项")
        private BigDecimal deductions;

                /** 实发工资 */
                @Excel(name = "实发工资")
        private BigDecimal netSalary;

                public void setId(Long id) {
                    this.id = id;
                }

                public Long getId() {
                    return id;
                }
                public void setEmployeeName(String employeeName) {
                    this.employeeName = employeeName;
                }

                public String getEmployeeName() {
                    return employeeName;
                }
                public void setBaseSalary(BigDecimal baseSalary) {
                    this.baseSalary = baseSalary;
                }

                public BigDecimal getBaseSalary() {
                    return baseSalary;
                }
                public void setBonus(BigDecimal bonus) {
                    this.bonus = bonus;
                }

                public BigDecimal getBonus() {
                    return bonus;
                }
                public void setDeductions(BigDecimal deductions) {
                    this.deductions = deductions;
                }

                public BigDecimal getDeductions() {
                    return deductions;
                }
                public void setNetSalary(BigDecimal netSalary) {
                    this.netSalary = netSalary;
                }

                public BigDecimal getNetSalary() {
                    return netSalary;
                }

        @Override
        public String toString() {
            return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("employeeName", getEmployeeName())
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
