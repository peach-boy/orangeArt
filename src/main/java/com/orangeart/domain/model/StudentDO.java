package com.orangeart.domain.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @Description: 学生
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:22
 * @Email:1414924381@qq.com
 */
@Entity
@Data
@Table(name = "student")
public class StudentDO extends BaseDO {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name", unique = true, nullable = false, length = 256)
    private String name;

    @Column(name = "birth_year")
    private Date birthYear;

    @Column(name = "address", length = 256)
    private String address;

    @Column(name = "mobile", length = 20)
    private String mobile;

    @Column(name = "gender", length = 4)
    private Integer gender;

    @Column(name = "channel", length = 20)
    private Integer channel;

    @Column(name = "status", length = 4)
    private Integer status;

    @Column(name = "remark", length = 256)
    private String remark;


}
