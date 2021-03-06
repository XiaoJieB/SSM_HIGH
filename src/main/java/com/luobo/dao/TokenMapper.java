package com.luobo.dao;

import com.luobo.entity.Token;
import com.luobo.entity.TokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TokenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    long countByExample(TokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    int deleteByExample(TokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    int insert(Token record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    int insertSelective(Token record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    List<Token> selectByExample(TokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    Token selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    int updateByExampleSelective(@Param("record") Token record, @Param("example") TokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    int updateByExample(@Param("record") Token record, @Param("example") TokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    int updateByPrimaryKeySelective(Token record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    int updateByPrimaryKey(Token record);
}