package com.kkyu.finance.service.impl;

import java.util.List;

import com.kkyu.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kkyu.finance.mapper.FinanceSalaryMapper;
import com.kkyu.finance.domain.FinanceSalary;
import com.kkyu.finance.service.IFinanceSalaryService;

/**
 * 薪资管理Service业务层处理
 *
 * @author kkyu
 * @date 2025-02-11
 */
@Service
public class FinanceSalaryServiceImpl implements IFinanceSalaryService
{
    @Autowired
    private FinanceSalaryMapper financeSalaryMapper;

    /**
     * 查询薪资管理
     *
     * @param id 薪资管理主键
     * @return 薪资管理
     */
    @Override
    public FinanceSalary selectFinanceSalaryById(Long id)
    {
        return financeSalaryMapper.selectFinanceSalaryById(id);
    }

    /**
     * 查询薪资管理列表
     *
     * @param financeSalary 薪资管理
     * @return 薪资管理
     */
    @Override
    public List<FinanceSalary> selectFinanceSalaryList(FinanceSalary financeSalary)
    {
        return financeSalaryMapper.selectFinanceSalaryList(financeSalary);
    }

    /**
     * 新增薪资管理
     *
     * @param financeSalary 薪资管理
     * @return 结果
     */
    @Override
    public int insertFinanceSalary(FinanceSalary financeSalary)
    {
        financeSalary.setCreateTime(DateUtils.getNowDate());
        return financeSalaryMapper.insertFinanceSalary(financeSalary);
    }

    /**
     * 修改薪资管理
     *
     * @param financeSalary 薪资管理
     * @return 结果
     */
    @Override
    public int updateFinanceSalary(FinanceSalary financeSalary)
    {
        financeSalary.setUpdateTime(DateUtils.getNowDate());
        return financeSalaryMapper.updateFinanceSalary(financeSalary);
    }

    /**
     * 批量删除薪资管理
     *
     * @param ids 需要删除的薪资管理主键
     * @return 结果
     */
    @Override
    public int deleteFinanceSalaryByIds(Long[] ids)
    {
        return financeSalaryMapper.deleteFinanceSalaryByIds(ids);
    }

    /**
     * 删除薪资管理信息
     *
     * @param id 薪资管理主键
     * @return 结果
     */
    @Override
    public int deleteFinanceSalaryById(Long id)
    {
        return financeSalaryMapper.deleteFinanceSalaryById(id);
    }
}
