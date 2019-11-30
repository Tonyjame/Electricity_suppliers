package com.bigdata.bean;

public class AppActive_foreground {
    private String push_id; //推送的消息的ID
    private String access; // 1.push 2.icon 3.其他

    public String getPush_id() {
        return push_id;
    }

    public void setPush_id(String push_id) {
        this.push_id = push_id;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }
}
