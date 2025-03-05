package com.kkyu.employee.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.kkyu.common.annotation.Excel;
import com.kkyu.common.core.domain.BaseEntity;

/**
 * 员工档案管理对象 sys_employee
 *
 * @author kkyu
 * @date 2025-03-05
 */
        public class Employee extends BaseEntity
        {
        private static final long serialVersionUID = 1L;

                /** 员工ID */
        private Long employeeId;

                /** 员工编号 */
                @Excel(name = "员工编号")
        private String employeeCode;

                /** 员工姓名 */
                @Excel(name = "员工姓名")
        private String employeeName;

                /** 性别（0未知 1男 2女） */
                @Excel(name = "性别", readConverterExp = "0=未知,1=男,2=女")
        private String gender;

                /** 出生日期 */
                @JsonFormat(pattern = "yyyy-MM-dd")
                @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
        private Date birthDate;

                /** 部门ID */
                @Excel(name = "部门ID")
        private Long deptId;

                /** 职位 */
                @Excel(name = "职位")
        private String position;

                /** 入职日期 */
                @JsonFormat(pattern = "yyyy-MM-dd")
                @Excel(name = "入职日期", width = 30, dateFormat = "yyyy-MM-dd")
        private Date hireDate;

                /** 联系电话 */
                @Excel(name = "联系电话")
        private String phone;

                /** 邮箱 */
                @Excel(name = "邮箱")
        private String email;

                /** 身份证号码 */
                @Excel(name = "身份证号码")
        private String idNumber;

                /** 联系地址 */
                @Excel(name = "联系地址")
        private String address;

                /** 员工状态（0在职 1离职） */
                @Excel(name = "员工状态", readConverterExp = "0=在职,1=离职")
        private String status;

                public void setEmployeeId(Long employeeId) {
                    this.employeeId = employeeId;
                }

                public Long getEmployeeId() {
                    return employeeId;
                }
                public void setEmployeeCode(String employeeCode) {
                    this.employeeCode = employeeCode;
                }

                public String getEmployeeCode() {
                    return employeeCode;
                }
                public void setEmployeeName(String employeeName) {
                    this.employeeName = employeeName;
                }

                public String getEmployeeName() {
                    return employeeName;
                }
                public void setGender(String gender) {
                    this.gender = gender;
                }

                public String getGender() {
                    return gender;
                }
                public void setBirthDate(Date birthDate) {
                    this.birthDate = birthDate;
                }

                public Date getBirthDate() {
                    return birthDate;
                }
                public void setDeptId(Long deptId) {
                    this.deptId = deptId;
                }

                public Long getDeptId() {
                    return deptId;
                }
                public void setPosition(String position) {
                    this.position = position;
                }

                public String getPosition() {
                    return position;
                }
                public void setHireDate(Date hireDate) {
                    this.hireDate = hireDate;
                }

                public Date getHireDate() {
                    return hireDate;
                }
                public void setPhone(String phone) {
                    this.phone = phone;
                }

                public String getPhone() {
                    return phone;
                }
                public void setEmail(String email) {
                    this.email = email;
                }

                public String getEmail() {
                    return email;
                }
                public void setIdNumber(String idNumber) {
                    this.idNumber = idNumber;
                }

                public String getIdNumber() {
                    return idNumber;
                }
                public void setAddress(String address) {
                    this.address = address;
                }

                public String getAddress() {
                    return address;
                }
                public void setStatus(String status) {
                    this.status = status;
                }

                public String getStatus() {
                    return status;
                }

        @Override
        public String toString() {
            return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("employeeId", getEmployeeId())
                .append("employeeCode", getEmployeeCode())
                .append("employeeName", getEmployeeName())
                .append("gender", getGender())
                .append("birthDate", getBirthDate())
                .append("deptId", getDeptId())
                .append("position", getPosition())
                .append("hireDate", getHireDate())
                .append("phone", getPhone())
                .append("email", getEmail())
                .append("idNumber", getIdNumber())
                .append("address", getAddress())
                .append("status", getStatus())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                    .toString();
        }
}
