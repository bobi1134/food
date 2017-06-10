package cn.mrx.food.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName: Remark
 * @Author: Mr.X
 * @Date: 2017/6/10 20:12
 * @Description:
 * @Version 1.0
 */
@Entity
@Table(name = "t_remark")
public class Remark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int COMMENT '主键id'")
    private Integer id;

    @Lob
    @Column(name = "remark_content", columnDefinition = "mediumtext COMMENT '评论内容'")
    private String remarkContent;

    @Column(name = "remark_time", columnDefinition = "timestamp default CURRENT_TIMESTAMP COMMENT '评论时间'")
    private Date remarkTime;

    @Column(name = "dish_id", columnDefinition = "int COMMENT '所属菜品id'")
    private Integer dishId;

    @ManyToOne(targetEntity=User.class, cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="user_id", referencedColumnName="id")
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRemarkContent() {
        return remarkContent;
    }

    public void setRemarkContent(String remarkContent) {
        this.remarkContent = remarkContent;
    }

    public Date getRemarkTime() {
        return remarkTime;
    }

    public void setRemarkTime(Date remarkTime) {
        this.remarkTime = remarkTime;
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
