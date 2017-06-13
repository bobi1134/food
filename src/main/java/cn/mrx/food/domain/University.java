package cn.mrx.food.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName: University
 * @Author: Mr.X
 * @Date: 2017/6/6 20:20
 * @Description:
 * @Version 1.0
 */
@Entity
@Table(name = "t_university")
public class University implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int COMMENT '主键id'")
    private Integer id;

    @Column(name = "university_cn_name", unique = true, columnDefinition = "varchar(20) COMMENT '大学中文名称'")
    private String universityCName;

    @Column(name = "university_en_name", unique = true, columnDefinition = "varchar(150) COMMENT '大学英文名称'")
    private String universityEName;

    @Lob
    @Column(name = "cn_description",  columnDefinition = "mediumtext COMMENT '大学中文描述'")
    private String cnDescription;

    @Lob
    @Column(name = "en_description", columnDefinition = "mediumtext COMMENT '大学英文描述'")
    private String enDescription;

    @Column(name = "university_img", columnDefinition = "varchar(100) COMMENT '大学封面'")
    private String universityImg;

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

    public String getUniversityImg() {
        return universityImg;
    }

    public void setUniversityImg(String universityImg) {
        this.universityImg = universityImg;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", universityCName='" + universityCName + '\'' +
                ", universityEName='" + universityEName + '\'' +
                ", cnDescription='" + cnDescription + '\'' +
                ", enDescription='" + enDescription + '\'' +
                ", universityImg='" + universityImg + '\'' +
                '}';
    }
}
