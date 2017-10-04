package com.qd.main;

import com.qd.controller.SenderController;
import com.qd.model.FromStation;
import com.qd.model.Sender;
import com.qd.model.Vehicle;
import com.qd.repository.SenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

public class Test {
    @Autowired
    private SenderRepository senderRepository;

    private void init() {
//        Sender sender1 = new Sender(1, "阿尔法阀门","13706869862", "阀门","重量");
//        Sender sender2 = new Sender(2, "埃尔柯铜业水暖","13905866062", "阀门","重量");
//        Sender sender3 = new Sender(3, "艾迪西流体控制","13656565565", "配件","重量");
//
//        List<Sender> senderList = new ArrayList<Sender>();
//        senderList.add(sender1);
//        senderList.add(sender2);
//        senderList.add(sender3);
//
//        Vehicle vehicle1 = new Vehicle(1,"赣A40R86", 40, 100);
//        Vehicle vehicle2 = new Vehicle(2,"赣A64X13", 40, 100);
//        Vehicle vehicle3 = new Vehicle(3,"赣AA459O", 40, 100);
//        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
//        vehicleList.add(vehicle1);
//        vehicleList.add(vehicle2);
//        vehicleList.add(vehicle3);
//
//        FromStation fromStation1 = new FromStation(1, "发站1", vehicleList, senderList);

    }
    public static void main(String[] args) {
    }
}
