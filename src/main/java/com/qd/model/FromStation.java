package com.qd.model;

import java.util.Date;
import java.util.List;

public class FromStation {
    private Integer stationId;
    private String stationName;
    private Date createdDate;
    private Date updatedDate;
    private String operatedBy;
    private List<Vehicle> vehicleList;

    public FromStation(Integer stationId, String stationName, List<Vehicle> vehicleList, List<Sender> serderList) {
        this.stationId = stationId;
        this.stationName = stationName;
        this.vehicleList = vehicleList;
        this.serderList = serderList;
    }

    public List<Sender> getSerderList() {
        return serderList;
    }

    public void setSerderList(List<Sender> serderList) {
        this.serderList = serderList;
    }

    private List<Sender> serderList;

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getOperatedBy() {
        return operatedBy;
    }

    public void setOperatedBy(String operatedBy) {
        this.operatedBy = operatedBy;
    }

}
