package cn.mrx.food.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @ClassName: User
 * @Author: Mr.X
 * @Date: 2017/6/6 18:28
 * @Description:
 * @Version 1.0
 */
@Entity
@Table(name = "t_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int COMMENT '主键id'")
    private Integer id;

    @Column(name = "email", unique = true, nullable = false, columnDefinition = "varchar(30) COMMENT '邮箱作为用户名'")
    private String email;

    @Column(name = "pwd", columnDefinition = "varchar(30) COMMENT '密码'")
    private String pwd;

    @Column(name = "nick_name", columnDefinition = "varchar(30) COMMENT '昵称姓名'")
    private String nickName;

    @Column(name = "img", columnDefinition = "varchar(100) COMMENT '头像'")
    private String img;

    @Column(name = "reg_time", columnDefinition = "timestamp default CURRENT_TIMESTAMP COMMENT '注册时间'")
    private Date regTime;

    @Column(name = "enabled", columnDefinition = "int default -1 COMMENT '是否启用,-1未启用(默认),1启用'")
    private Integer enabled;

    @Column(name = "role", columnDefinition = "int default 3 COMMENT '角色,1超级管理员,2网站管理员,3网站会员(默认)'")
    private Integer role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", nickName='" + nickName + '\'' +
                ", img='" + img + '\'' +
                ", regTime=" + regTime +
                ", enabled=" + enabled +
                ", role=" + role +
                '}';
    }
}
