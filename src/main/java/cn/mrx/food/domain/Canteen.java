package cn.mrx.food.domain;

import javax.persistence.*;
import java.util.List;

/**
 * @ClassName: Canteen
 * @Author: Mr.X
 * @Date: 2017/6/8 21:50
 * @Description:
 * @Version 1.0
 */
@Entity
@Table(name = "t_canteen")
public class Canteen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int COMMENT '主键id'")
    private Integer id;

    @Column(name = "canteen_name", unique = true, columnDefinition = "varchar(20) COMMENT '食堂名称'")
    private String canteenName;

    @Column(name = "university_id", columnDefinition = "int COMMENT '所属大学id'")
    private Integer universityId;

    /**
     * 食堂和菜品 一对多关系
     */
    @OneToMany(targetEntity=Dish.class, cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="canteen_id", referencedColumnName="id")
    private List<Dish> dishes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCanteenName() {
        return canteenName;
    }

    public void setCanteenName(String canteenName) {
        this.canteenName = canteenName;
    }

    public Integer getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Integer universityId) {
        this.universityId = universityId;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
