package entity;

public class Orders {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.id
     *
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.sn
     *
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
     */
    private String sn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.memo
     *
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
     */
    private String memo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.user_id
     *
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.id
     *
     * @return the value of orders.id
     *
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.id
     *
     * @param id the value for orders.id
     *
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.sn
     *
     * @return the value of orders.sn
     *
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
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
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
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
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
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
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
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
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
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
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}