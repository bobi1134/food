package cn.mrx.food.domain;

import javax.persistence.*;
import java.util.List;

/**
 * @ClassName: Dish
 * @Author: Mr.X
 * @Date: 2017/6/10 16:38
 * @Description:
 * @Version 1.0
 */
@Entity
@Table(name = "t_dish")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int COMMENT '主键id'")
    private Integer id;

    @Column(name = "dish_name", unique = true, columnDefinition = "varchar(20) COMMENT '菜品名称'")
    private String dishName;

    @Column(name = "dish_type", columnDefinition = "int COMMENT '菜品类别'")
    private Integer dishType;

    @Column(name = "praise_num", columnDefinition = "int default 0 COMMENT '点赞数'")
    private Integer praiseNum;

    @Column(name = "canteen_id", columnDefinition = "int COMMENT '所属食堂id,1:今日特色,2:蔬菜类,3:肉类,4:小吃类'")
    private int canteenId;

    /**
     * 菜品和评论 一对多关系
     */
    @OneToMany(targetEntity=Remark.class, cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="dish_id", referencedColumnName="id")
    private List<Remark> remarks;

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

    public int getCanteenId() {
        return canteenId;
    }

    public void setCanteenId(int canteenId) {
        this.canteenId = canteenId;
    }

    public List<Remark> getRemarks() {
        return remarks;
    }

    public void setRemarks(List<Remark> remarks) {
        this.remarks = remarks;
    }
}
