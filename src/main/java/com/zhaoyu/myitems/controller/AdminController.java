package com.zhaoyu.myitems.controller;

import com.zhaoyu.myitems.pojo.Admin;
import com.zhaoyu.myitems.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/tologin")
    public String tologin() {
        return "login";
    }

    @PostMapping("/login")
    public Boolean login(Admin admin) {
        ModelMap modelMap = new ModelMap();
        if (adminService.login(admin)) {
            modelMap.addAttribute("msg", "登录成功");
            return true;
        }
        modelMap.addAttribute("msg", "登录失败");
        return false;
    }
}
