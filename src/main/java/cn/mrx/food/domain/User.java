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
    private Integer id;

    @Column(name = "user_name", length = 10, unique = true, nullable = false)
    private String userName;

    @Column(name = "pwd", length = 10)
    private String pwd;

    @Column(name = "really_name")
    private String reallyName;

    @Column(name = "reg_time", columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date regTime;

    @Column(name = "enabled", columnDefinition = "int default -1", insertable = false)
    private Integer enabled;

    @Column(name = "role", columnDefinition = "int default 1", insertable = false)
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
