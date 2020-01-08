package com.yue.pojo;

import java.io.Serializable;

public class TbDing implements Serializable{
    private Integer id;

    private String dingId;

    private String keId;

    private String price;

    private String buyName;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDingId() {
        return dingId;
    }

    public void setDingId(String dingId) {
        this.dingId = dingId == null ? null : dingId.trim();
    }

    public String getKeId() {
        return keId;
    }

    public void setKeId(String keId) {
        this.keId = keId == null ? null : keId.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getBuyName() {
        return buyName;
    }

    public void setBuyName(String buyName) {
        this.buyName = buyName == null ? null : buyName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}