package cn.mrx.food.domain;

import javax.persistence.*;
import java.io.Serializable;
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
public class Remark implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int COMMENT '主键id'")
    private Integer id;

    @Lob
    @Column(name = "remark_content", columnDefinition = "mediumtext COMMENT '评论内容'")
    private String remarkContent;

    @Column(name = "remark_time", columnDefinition = "timestamp default CURRENT_TIMESTAMP COMMENT '评论时间'")
    private Date remarkTime;

    @Column(name = "dish_id", columnDefinition = "int COMMENT '菜品-外键id'")
    private Integer dishId;

    @Column(name = "user_id", columnDefinition = "int COMMENT '用户-外键id'")
    private Integer userId;

    private User user;

    private Dish dish;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    @Override
    public String toString() {
        return "Remark{" +
                "id=" + id +
                ", remarkContent='" + remarkContent + '\'' +
                ", remarkTime=" + remarkTime +
                ", dishId=" + dishId +
                ", userId=" + userId +
                ", user=" + user +
                ", dish=" + dish +
                '}';
    }
}
