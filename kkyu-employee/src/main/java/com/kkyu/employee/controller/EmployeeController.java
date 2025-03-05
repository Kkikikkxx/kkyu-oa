package com.kkyu.employee.controller;

import java.util.List;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kkyu.common.annotation.Log;
import com.kkyu.common.core.controller.BaseController;
import com.kkyu.common.core.domain.AjaxResult;
import com.kkyu.common.enums.BusinessType;
import com.kkyu.employee.domain.Employee;
import com.kkyu.employee.service.IEmployeeService;
import com.kkyu.common.utils.poi.ExcelUtil;
import com.kkyu.common.core.page.TableDataInfo;

/**
 * 员工档案管理Controller
 *
 * @author kkyu
 * @date 2025-03-05
 */
@RestController
@RequestMapping("/employee/archives")
public class EmployeeController extends BaseController {
    @Autowired
    private IEmployeeService employeeService;

/**
 * 查询员工档案管理列表
 */
@PreAuthorize("@ss.hasPermi('employee:archives:list')")
@GetMapping("/list")
    public TableDataInfo list(Employee employee) {
        startPage();
        List<Employee> list = employeeService.selectEmployeeList(employee);
        return getDataTable(list);
    }

    /**
     * 导出员工档案管理列表
     */
    @PreAuthorize("@ss.hasPermi('employee:archives:export')")
    @Log(title = "员工档案管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Employee employee) {
        List<Employee> list = employeeService.selectEmployeeList(employee);
        ExcelUtil<Employee> util = new ExcelUtil<Employee>(Employee. class);
        util.exportExcel(response, list, "员工档案管理数据");
    }

    /**
     * 获取员工档案管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('employee:archives:query')")
    @GetMapping(value = "/{employeeId}")
    public AjaxResult getInfo(@PathVariable("employeeId") Long employeeId) {
        return success(employeeService.selectEmployeeByEmployeeId(employeeId));
    }

    /**
     * 新增员工档案管理
     */
    @PreAuthorize("@ss.hasPermi('employee:archives:add')")
    @Log(title = "员工档案管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Employee employee) {
        return toAjax(employeeService.insertEmployee(employee));
    }

    /**
     * 修改员工档案管理
     */
    @PreAuthorize("@ss.hasPermi('employee:archives:edit')")
    @Log(title = "员工档案管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Employee employee) {
        return toAjax(employeeService.updateEmployee(employee));
    }

    /**
     * 删除员工档案管理
     */
    @PreAuthorize("@ss.hasPermi('employee:archives:remove')")
    @Log(title = "员工档案管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{employeeIds}")
    public AjaxResult remove(@PathVariable Long[] employeeIds) {
        return toAjax(employeeService.deleteEmployeeByEmployeeIds(employeeIds));
    }
}
