package com.rzj.Eia.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author authorName
 * @since 2020-06-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("User")
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    private String usr;

    private String pwd;

    private String role;

    @TableField("isEnable")
    private Boolean isEnable;

    @TableField("isDelete")
    private Boolean isDelete;

    @TableField("createTime")
    private String createTime;

    @TableField("updateTime")
    private String updateTime;


}
