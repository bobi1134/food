package cn.mrx.food.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName: User
 * @Author: Mr.X
 * @Date: 2017/6/6 18:28
 * @Description:
 * @Version 1.0
 */
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int COMMENT '主键id'")
    private Integer id;

    @Column(name = "user_name", unique = true, nullable = false, columnDefinition = "varchar(10) COMMENT '用户名'")
    private String userName;

    @Column(name = "pwd", columnDefinition = "varchar(10) COMMENT '密码'")
    private String pwd;

    @Column(name = "really_name", columnDefinition = "varchar(10) COMMENT '真实姓名'")
    private String reallyName;

    @Column(name = "reg_time", columnDefinition = "timestamp default CURRENT_TIMESTAMP COMMENT '注册时间'")
    private Date regTime;

    @Column(name = "enabled", columnDefinition = "int default -1 COMMENT '是否启用,-1未启用(默认),1启用'", insertable = false)
    private Integer enabled;

    @Column(name = "role", columnDefinition = "int default 3 COMMENT '角色,1超级管理员,2网站管理员,3网站会员(默认)'", insertable = false)
    private Integer role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getReallyName() {
        return reallyName;
    }

    public void setReallyName(String reallyName) {
        this.reallyName = reallyName;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}
