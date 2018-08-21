package com.zhaoyu.myitems.service;

import com.zhaoyu.myitems.pojo.Admin;

public interface AdminService {
    public Boolean login(Admin admin);

    public void register(Admin admin);

    public void updateAdmin(Admin admin);

    public void deleteAdmin(Admin admin);
}
