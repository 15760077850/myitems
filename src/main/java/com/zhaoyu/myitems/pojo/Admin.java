package com.zhaoyu.myitems.pojo;

import java.io.Serializable;

/**
 * admin包括:主键id,name,password,telephone(账号,密码,电话号)
 */
public class Admin implements Serializable {
    private Integer id;
    private String name;
    private Integer nameid;
    private String password;
    private String telephone;
    private String msg;

    public Integer getNameid() {
        return nameid;
    }

    public void setNameid(Integer nameid) {
        this.nameid = nameid;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Admin(Integer id, String name, Integer nameid, String password, String telephone, String msg) {
        this.id = id;
        this.name = name;
        this.nameid = nameid;
        this.password = password;
        this.telephone = telephone;
        this.msg = msg;
    }

    public Admin() {
    }
}
