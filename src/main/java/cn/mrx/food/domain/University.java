package cn.mrx.food.domain;

import javax.persistence.*;

/**
 * @ClassName: University
 * @Author: Mr.X
 * @Date: 2017/6/6 20:20
 * @Description:
 * @Version 1.0
 */
@Entity
@Table(name = "t_university")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "university_name", length = 10, unique = true)
    private String universityName;

    @Column(name = "description", length = 16777216, unique = true)
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
