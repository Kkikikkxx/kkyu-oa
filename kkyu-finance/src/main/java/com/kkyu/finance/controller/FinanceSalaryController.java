package com.kkyu.finance.controller;

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
import com.kkyu.finance.domain.FinanceSalary;
import com.kkyu.finance.service.IFinanceSalaryService;
import com.kkyu.common.utils.poi.ExcelUtil;
import com.kkyu.common.core.page.TableDataInfo;

/**
 * 薪资管理Controller
 *
 * @author kkyu
 */
@RestController
@RequestMapping("/finance/salary")
public class FinanceSalaryController extends BaseController {
    @Autowired
    private IFinanceSalaryService financeSalaryService;

    /**
     * 查询薪资管理列表
     */
    @PreAuthorize("@ss.hasPermi('finance:salary:list')")
    @GetMapping("/list")
    public TableDataInfo list(FinanceSalary financeSalary) {
        startPage();
        List<FinanceSalary> list = financeSalaryService.selectFinanceSalaryList(financeSalary);
        return getDataTable(list);
    }

    /**
     * 导出薪资管理列表
     */
    @PreAuthorize("@ss.hasPermi('finance:salary:export')")
    @Log(title = "薪资管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FinanceSalary financeSalary) {
        List<FinanceSalary> list = financeSalaryService.selectFinanceSalaryList(financeSalary);
        ExcelUtil<FinanceSalary> util = new ExcelUtil<FinanceSalary>(FinanceSalary. class);
        util.exportExcel(response, list, "薪资管理数据");
    }

    /**
     * 获取薪资管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('finance:salary:query')")
    @GetMapping(value = "/{salaryId}")
    public AjaxResult getInfo(@PathVariable("salaryId") Long salaryId) {
        return success(financeSalaryService.selectFinanceSalaryBySalaryId(salaryId));
    }

    /**
     * 新增薪资管理
     */
    @PreAuthorize("@ss.hasPermi('finance:salary:add')")
    @Log(title = "薪资管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FinanceSalary financeSalary) {
        return toAjax(financeSalaryService.insertFinanceSalary(financeSalary));
    }

    /**
     * 修改薪资管理
     */
    @PreAuthorize("@ss.hasPermi('finance:salary:edit')")
    @Log(title = "薪资管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FinanceSalary financeSalary) {
        return toAjax(financeSalaryService.updateFinanceSalary(financeSalary));
    }

    /**
     * 删除薪资管理
     */
    @PreAuthorize("@ss.hasPermi('finance:salary:remove')")
    @Log(title = "薪资管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{salaryIds}")
    public AjaxResult remove(@PathVariable Long[] salaryIds) {
        return toAjax(financeSalaryService.deleteFinanceSalaryBySalaryIds(salaryIds));
    }
}
