package com.qd.model;

import javax.persistence.*;

@Entity
@Table(name = "senderreceiver", schema = "logistics", catalog = "")
public class SenderReceiver {
    private Integer id;
    private String receivernName;
    private String receiverTel;
    private Integer rcpid;
    private String area;
    private Integer sdId;
    private String senderName;
    private String senderTel;
    private String unitType;
    private Integer vId;
    private String plate;
    private Integer rcId;
    private String receiversname;

    @Id
    @Column(name = "scid", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "receivername", nullable = true, length = 100)
    public String getReceivernName() {
        return receivernName;
    }

    public void setReceivernName(String receivernName) {
        this.receivernName = receivernName;
    }

    @Basic
    @Column(name = "receivertel", nullable = true, length = 100)
    public String getReceiverTel() {
        return receiverTel;
    }

    public void setReceiverTel(String receiverTel) {
        this.receiverTel = receiverTel;
    }

    @Basic
    @Column(name = "repid", nullable = true, length = 100)
    public Integer getRcpid() {
        return rcpid;
    }

    public void setRcpid(Integer rcpid) {
        this.rcpid = rcpid;
    }

    @Basic
    @Column(name = "area", nullable = true, length = 100)
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    @Column(name = "sdid", nullable = true, length = 100)
    public Integer getSdId() {
        return sdId;
    }

    public void setSdId(Integer sdId) {
        this.sdId = sdId;
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
    @Column(name = "unittype", nullable = true, length = 100)
    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    @Basic
    @Column(name = "vid", nullable = true, length = 100)
    public Integer getvId() {
        return vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    @Basic
    @Column(name = "plate", nullable = true, length = 100)
    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Basic
    @Column(name = "rcid", nullable = true, length = 100)
    public Integer getRcId() {
        return rcId;
    }

    public void setRcId(Integer rcId) {
        this.rcId = rcId;
    }

    @Basic
    @Column(name = "receiversname", nullable = true, length = 100)
    public String getReceiversname() {
        return receiversname;
    }

    public void setReceiversname(String receiversname) {
        this.receiversname = receiversname;
    }
}
