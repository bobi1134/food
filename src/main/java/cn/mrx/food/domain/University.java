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

    @Column(name = "university_cn_name", unique = true, columnDefinition = "varchar(20) COMMENT '大学中文名称'")
    private String universityCName;

    @Column(name = "university_en_name", unique = true, columnDefinition = "varchar(50) COMMENT '大学英文名称'")
    private String universityEName;

    @Lob
    @Column(name = "cn_description", unique = true,  columnDefinition = "mediumtext COMMENT '大学中文描述'")
    private String cnDescription;

    @Lob
    @Column(name = "en_description", unique = true, columnDefinition = "mediumtext COMMENT '大学英文描述'")
    private String enDescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUniversityCName() {
        return universityCName;
    }

    public void setUniversityCName(String universityCName) {
        this.universityCName = universityCName;
    }

    public String getUniversityEName() {
        return universityEName;
    }

    public void setUniversityEName(String universityEName) {
        this.universityEName = universityEName;
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
