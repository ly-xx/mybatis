package com.lxx.auto.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

import java.util.Date;

/**
 * 测试建表
 *
 * @author liaoxiaoxia
 * @version 2.3.0
 * @date 2020-8-20 10:21
 * @since JDK 1.8
 */
@Table(name = "test_address")
public class TestAddress {

    @Column(name = "id", comment = "主键", type = MySqlTypeConstant.INT, length = 11, isKey = true, isAutoIncrement = true)
    private Integer id;

    @Column(name = "name", comment = "名称", type = MySqlTypeConstant.VARCHAR, length = 111)
    private String name;

    @Column(name = "description",comment = "描述",  type = MySqlTypeConstant.TEXT)
    private String description;

    @Column(name = "create_time",comment = "添加时间", type = MySqlTypeConstant.DATETIME)
    private Date createTime;

    @Column(name = "update_time",comment = "更新时间", type = MySqlTypeConstant.DATETIME)
    private Date updateTime;

    @Column(name = "number", type = MySqlTypeConstant.BIGINT, length = 5)
    private Long number;

    @Column(name = "lifecycle", type = MySqlTypeConstant.CHAR, length = 1)
    private String lifecycle;

    @Column(name = "dekes", type = MySqlTypeConstant.DOUBLE, length = 5, decimalLength = 2)
    private Double dekes;

    @Column(name = "test", type = MySqlTypeConstant.DOUBLE, length = 3, decimalLength = 2)
    private Double test;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Double getTest() {
        return test;
    }

    public void setTest(Double test) {
        this.test = test;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    public Double getDekes() {
        return dekes;
    }

    public void setDekes(Double dekes) {
        this.dekes = dekes;
    }
}
