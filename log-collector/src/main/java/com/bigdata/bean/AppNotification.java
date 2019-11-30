package com.bigdata.bean;

public class AppNotification {
    private String action; //动作
    private String type; //通知ID
    private String ap_time; //客户端弹出时间
    private String content; //备用字段

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAp_time() {
        return ap_time;
    }

    public void setAp_time(String ap_time) {
        this.ap_time = ap_time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
