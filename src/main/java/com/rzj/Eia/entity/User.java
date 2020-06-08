package com.rzj.Eia.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;


/**
 * <p>
 * 
 * </p>
 *
 * @author authorName
 * @since 2020-06-05
 */
@TableName(value = "User")
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    private String usr;

    private String pwd;

    private String role;

    @TableField("isEnable")
    private Boolean isEnable;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getEnable() {
        return isEnable;
    }

    public void setEnable(Boolean enable) {
        isEnable = enable;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @TableField("isDelete")
    private Boolean isDelete;

    @TableField("createTime")
    private String createTime;

    @TableField("updateTime")
    private String updateTime;


}
