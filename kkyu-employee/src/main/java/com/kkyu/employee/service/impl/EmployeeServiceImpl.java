package com.kkyu.employee.service.impl;

import java.util.List;
        import com.kkyu.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kkyu.employee.mapper.EmployeeMapper;
import com.kkyu.employee.domain.Employee;
import com.kkyu.employee.service.IEmployeeService;

/**
 * 员工档案管理Service业务层处理
 *
 * @author kkyu
 * @date 2025-03-05
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 查询员工档案管理
     *
     * @param employeeId 员工档案管理主键
     * @return 员工档案管理
     */
    @Override
    public Employee selectEmployeeByEmployeeId(Long employeeId) {
        return employeeMapper.selectEmployeeByEmployeeId(employeeId);
    }

    /**
     * 查询员工档案管理列表
     *
     * @param employee 员工档案管理
     * @return 员工档案管理
     */
    @Override
    public List<Employee> selectEmployeeList(Employee employee) {
        return employeeMapper.selectEmployeeList(employee);
    }

    /**
     * 新增员工档案管理
     *
     * @param employee 员工档案管理
     * @return 结果
     */
    @Override
    public int insertEmployee(Employee employee) {
                employee.setCreateTime(DateUtils.getNowDate());
            return employeeMapper.insertEmployee(employee);
    }

    /**
     * 修改员工档案管理
     *
     * @param employee 员工档案管理
     * @return 结果
     */
    @Override
    public int updateEmployee(Employee employee) {
                employee.setUpdateTime(DateUtils.getNowDate());
        return employeeMapper.updateEmployee(employee);
    }

    /**
     * 批量删除员工档案管理
     *
     * @param employeeIds 需要删除的员工档案管理主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeByEmployeeIds(Long[] employeeIds) {
        return employeeMapper.deleteEmployeeByEmployeeIds(employeeIds);
    }

    /**
     * 删除员工档案管理信息
     *
     * @param employeeId 员工档案管理主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeByEmployeeId(Long employeeId) {
        return employeeMapper.deleteEmployeeByEmployeeId(employeeId);
    }
}
