package entity;

public class OrderDetail {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.id
     *
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.item_id
     *
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
     */
    private Integer itemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.item_num
     *
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
     */
    private Integer itemNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.orders_id
     *
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
     */
    private Integer ordersId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.id
     *
     * @return the value of order_detail.id
     *
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.id
     *
     * @param id the value for order_detail.id
     *
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.item_id
     *
     * @return the value of order_detail.item_id
     *
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.item_id
     *
     * @param itemId the value for order_detail.item_id
     *
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.item_num
     *
     * @return the value of order_detail.item_num
     *
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
     */
    public Integer getItemNum() {
        return itemNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.item_num
     *
     * @param itemNum the value for order_detail.item_num
     *
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
     */
    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.orders_id
     *
     * @return the value of order_detail.orders_id
     *
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
     */
    public Integer getOrdersId() {
        return ordersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.orders_id
     *
     * @param ordersId the value for order_detail.orders_id
     *
     * @mbg.generated Fri Sep 21 16:49:58 CST 2018
     */
    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }
}