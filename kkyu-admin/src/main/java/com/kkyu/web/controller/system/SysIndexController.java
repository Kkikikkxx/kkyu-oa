package com.kkyu.web.controller.system;

import com.kkyu.common.config.KkyuConfig;
import com.kkyu.common.utils.StringUtils;
import com.kkyu.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页
 *
 * @author kkyu
 */
@RestController
@RequestMapping("/index")
public class SysIndexController {
    /**
     * 系统基础配置
     */
    @Autowired
    private KkyuConfig kkyuConfig;

    @Autowired
    private ISysUserService sysUserService;

    /**
     * 访问首页，提示语
     */
    @RequestMapping("/")
    public String index() {
        return StringUtils.format("欢迎使用{}后台管理框架，当前版本：v{}，请通过前端地址访问。", kkyuConfig.getName(), kkyuConfig.getVersion());
    }

    /**
     * 获取所有用户数量
     */
    @GetMapping("/totalUser")
    public int getTotalUser() {
        return sysUserService.countTotalUsers();
    }

    /**
     * 获取离职员工数量
     */
    @GetMapping("/leaveUser")
    public int getLeaveUser() {
        return sysUserService.countLeaveUsers();
    }
}
