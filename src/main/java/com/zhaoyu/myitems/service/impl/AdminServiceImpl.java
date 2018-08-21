package com.zhaoyu.myitems.service.impl;


import com.zhaoyu.myitems.mapper.AdminMapper;
import com.zhaoyu.myitems.pojo.Admin;
import com.zhaoyu.myitems.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public Boolean login(Admin admin) {
        List<Admin> list = adminMapper.select(admin);
        if (list.size() == 1 && list != null) {
            return true;
        }
        return false;
    }

    public void register(Admin admin) {

    }

    public void updateAdmin(Admin admin) {

    }

    public void deleteAdmin(Admin admin) {

    }
}
