package com.luobo.entity;

import java.util.Date;

public class Token {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column token.id
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column token.token_str
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    private String tokenStr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column token.create_time
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column token.id
     *
     * @return the value of token.id
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column token.id
     *
     * @param id the value for token.id
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column token.token_str
     *
     * @return the value of token.token_str
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    public String getTokenStr() {
        return tokenStr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column token.token_str
     *
     * @param tokenStr the value for token.token_str
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    public void setTokenStr(String tokenStr) {
        this.tokenStr = tokenStr == null ? null : tokenStr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column token.create_time
     *
     * @return the value of token.create_time
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column token.create_time
     *
     * @param createTime the value for token.create_time
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}