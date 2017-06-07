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
    @Column(columnDefinition = "int COMMENT '主键id'")
    private Integer id;

    @Column(name = "university_name", unique = true, columnDefinition = "varchar(10) COMMENT '大学名称'")
    private String universityName;

    @Lob
    @Column(name = "cn_description", unique = true,  columnDefinition = "tinytext COMMENT '大学中文描述'")
    private String cnDescription;

    @Lob
    @Column(name = "en_description", unique = true, columnDefinition = "tinytext COMMENT '大学英文描述'")
    private String enDescription;

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

    public String getCnDescription() {
        return cnDescription;
    }

    public void setCnDescription(String cnDescription) {
        this.cnDescription = cnDescription;
    }

    public String getEnDescription() {
        return enDescription;
    }

    public void setEnDescription(String enDescription) {
        this.enDescription = enDescription;
    }
}
