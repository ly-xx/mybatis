package com.lxx.springmybatis.mapper;

import com.lxx.springmybatis.entity.Travel;

public interface TravelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel
     *
     * @mbg.generated
     */
    int insert(Travel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel
     *
     * @mbg.generated
     */
    int insertSelective(Travel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel
     *
     * @mbg.generated
     */
    Travel selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Travel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Travel record);
}