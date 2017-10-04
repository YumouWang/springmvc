package com.qd.model;

import javax.persistence.*;

@Entity
@Table(name = "sender", schema = "logistics", catalog = "")
public class Sender {
    private Integer senderId;
    private String senderName;
    private String senderTel;
    private String productName;
    private String unitType;
    private String area;

    @Id
    @Column(name = "sdid", nullable = false)
    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    @Basic
    @Column(name = "sendername", nullable = true, length = 100)
    public String getSenderName() {
        return senderName;
    }


    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    @Basic
    @Column(name = "sendertel", nullable = true, length = 100)
    public String getSenderTel() {
        return senderTel;
    }

    public void setSenderTel(String senderTel) {
        this.senderTel = senderTel;
    }

    @Basic
    @Column(name = "productname", nullable = true, length = 100)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "unittype", nullable = true, length = 100)
    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    @Basic
    @Column(name = "area", nullable = true, length = 100)
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
