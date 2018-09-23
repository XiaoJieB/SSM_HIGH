package com.luobo.entity;

import java.util.HashMap;
import java.util.Map;
/*
    返回消息
 */
public class Message {
    //状态码 100 成功 200异常
    private Integer code;
    //提示信息
    private String msg;
    //
    private Map<String,Object> extend = new HashMap<String, Object>(0);

    public static Message success() {
        Message massage = new Message();
        massage.setCode(100);
        massage.setMsg("处理成功");
        return massage;
    }

    public static Message error() {
        Message massage = new Message();
        massage.setCode(200);
        massage.setMsg("处理失败");
        return massage;
    }

    public Message add(String key, Object value) {
        this.getExtend().put(key, value);
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }
}
