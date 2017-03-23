package com.cqu.festival_sms.bean;

/**
 * Created by Administrator on 2017/3/19.
 */
public class Msg {
    private int id;
    private int festivaId;
    private String content;

    public Msg(int id, int festivaId, String content) {
        this.id = id;
        this.festivaId = festivaId;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFestivaId() {
        return festivaId;
    }

    public void setFestivaId(int festivaId) {
        this.festivaId = festivaId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
