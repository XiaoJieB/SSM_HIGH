package com.luobo.entity;

public class Orders {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.o_id
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    private Integer oId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.sn
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    private String sn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.memo
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    private String memo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.user_id
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.o_id
     *
     * @return the value of orders.o_id
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    public Integer getoId() {
        return oId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.o_id
     *
     * @param oId the value for orders.o_id
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    public void setoId(Integer oId) {
        this.oId = oId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.sn
     *
     * @return the value of orders.sn
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    public String getSn() {
        return sn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.sn
     *
     * @param sn the value for orders.sn
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.memo
     *
     * @return the value of orders.memo
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.memo
     *
     * @param memo the value for orders.memo
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.user_id
     *
     * @return the value of orders.user_id
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.user_id
     *
     * @param userId the value for orders.user_id
     *
     * @mbg.generated Sat Sep 22 20:46:17 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}