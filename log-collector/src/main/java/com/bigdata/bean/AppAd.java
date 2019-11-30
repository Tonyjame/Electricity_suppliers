package com.bigdata.bean;

public class AppAd {
    private String entry; //入口
    private String action;// 动作
    private String content; //状态
    private String detail; //失败码
    private String source; //广告来源 admob=1 facebook=2 adx百度=3 vk俄罗斯=4
    private String behavior; //用户行为
    private String newstype; //type:1:图文
    private String show_style; //内容样式

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public String getNewstype() {
        return newstype;
    }

    public void setNewstype(String newstype) {
        this.newstype = newstype;
    }

    public String getShow_style() {
        return show_style;
    }

    public void setShow_style(String show_style) {
        this.show_style = show_style;
    }
}
