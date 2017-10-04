package com.qd.model;

import javax.persistence.*;

@Entity
@Table(name = "receiver", schema = "logistics", catalog = "")
public class Receiver {
    private Integer id;
    private String receiverName;
    private String receiverTel;
    private String receiverId;
    private String area;

    @Id
    @Column(name = "rcpid", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "receivername", nullable = true, length = 100)
    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
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
    @Column(name = "receiverid", nullable = true, length = 100)
    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
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
