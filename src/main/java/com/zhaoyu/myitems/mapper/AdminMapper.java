package com.zhaoyu.myitems.mapper;

import com.zhaoyu.myitems.pojo.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminMapper {
    public List<Admin> select(Admin admin);

    public void delete(Integer id);

    public Admin update(Admin admin);

    public Admin add(Admin admin);
}
