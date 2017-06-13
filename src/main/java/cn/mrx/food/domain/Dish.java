package cn.mrx.food.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @ClassName: Dish
 * @Author: Mr.X
 * @Date: 2017/6/10 16:38
 * @Description:
 * @Version 1.0
 */
@Entity
@Table(name = "t_dish")
public class Dish implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int COMMENT '主键id'")
    private Integer id;

    @Column(name = "dish_name", columnDefinition = "varchar(20) COMMENT '菜品名称'")
    private String dishName;

    @Column(name = "dish_type", columnDefinition = "int COMMENT '菜品类别'")
    private Integer dishType;

    @Column(name = "dish_img", columnDefinition = "varchar(100) COMMENT '菜品封面'")
    private String dishImg;

    @Column(name = "praise_num", columnDefinition = "int default 0 COMMENT '点赞数'")
    private Integer praiseNum;

    @Column(name = "canteen_id", columnDefinition = "int COMMENT '食堂-外键id'")
    private Integer canteenId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getDishType() {
        return dishType;
    }

    public void setDishType(int dishType) {
        this.dishType = dishType;
    }

    public void setDishType(Integer dishType) {
        this.dishType = dishType;
    }

    public Integer getPraiseNum() {
        return praiseNum;
    }

    public void setPraiseNum(Integer praiseNum) {
        this.praiseNum = praiseNum;
    }

    public String getDishImg() {
        return dishImg;
    }

    public void setDishImg(String dishImg) {
        this.dishImg = dishImg;
    }

    public Integer getCanteenId() {
        return canteenId;
    }

    public void setCanteenId(Integer canteenId) {
        this.canteenId = canteenId;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", dishName='" + dishName + '\'' +
                ", dishType=" + dishType +
                ", dishImg='" + dishImg + '\'' +
                ", praiseNum=" + praiseNum +
                ", canteenId=" + canteenId +
                '}';
    }
}
