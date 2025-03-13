package com.kkyu.employee.controller;

import com.kkyu.common.annotation.Log;
import com.kkyu.common.core.controller.BaseController;
import com.kkyu.common.core.domain.AjaxResult;
import com.kkyu.common.core.page.TableDataInfo;
import com.kkyu.common.enums.BusinessType;
import com.kkyu.common.utils.poi.ExcelUtil;
import com.kkyu.employee.domain.Employee;
import com.kkyu.employee.service.IEmployeeService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 员工档案管理Controller
 *
 * @author kkyu
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
