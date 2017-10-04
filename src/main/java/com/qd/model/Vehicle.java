package com.qd.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "vehicle", schema = "logistics", catalog = "")
public class Vehicle {
    private Integer vehicleId;
    private String plate;
    private Integer weight;
    private Integer volume;

    @Basic
    @Column(name = "plate", nullable = true, length = 100)
    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Basic
    @Column(name = "weight", nullable = true, length = 100)
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "volume", nullable = true, length = 100)
    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Id
    @Column(name = "vid", nullable = false)
    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }




}
