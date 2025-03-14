package com.kkyu.finance.service;

import java.util.List;

import com.kkyu.finance.domain .FinanceSalary;

/**
 * 薪资管理Service接口
 *
 * @author kkyu
 */
public interface IFinanceSalaryService {
    /**
     * 查询薪资管理
     *
     * @param salaryId 薪资管理主键
     * @return 薪资管理
     */
    public FinanceSalary selectFinanceSalaryBySalaryId(Long salaryId);

    /**
     * 查询薪资管理列表
     *
     * @param financeSalary 薪资管理
     * @return 薪资管理集合
     */
    public List<FinanceSalary> selectFinanceSalaryList(FinanceSalary financeSalary);

    /**
     * 新增薪资管理
     *
     * @param financeSalary 薪资管理
     * @return 结果
     */
    public int insertFinanceSalary(FinanceSalary financeSalary);

    /**
     * 修改薪资管理
     *
     * @param financeSalary 薪资管理
     * @return 结果
     */
    public int updateFinanceSalary(FinanceSalary financeSalary);

    /**
     * 批量删除薪资管理
     *
     * @param salaryIds 需要删除的薪资管理主键集合
     * @return 结果
     */
    public int deleteFinanceSalaryBySalaryIds(Long[] salaryIds);

    /**
     * 删除薪资管理信息
     *
     * @param salaryId 薪资管理主键
     * @return 结果
     */
    public int deleteFinanceSalaryBySalaryId(Long salaryId);
}
