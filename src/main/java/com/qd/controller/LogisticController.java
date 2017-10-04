package com.qd.controller;

import com.qd.model.Sender;
import com.qd.model.SenderReceiver;
import com.qd.model.UserEntity;
import com.qd.model.Vehicle;
import com.qd.repository.ReceiverRepository;
import com.qd.repository.SenderReceiverRepository;
import com.qd.repository.SenderRepository;
import com.qd.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class LogisticController {
    @Autowired
    private SenderRepository senderRepository;
    @Autowired
    private ReceiverRepository receiverRepository;
    @Autowired
    private SenderReceiverRepository senderReceiverRepository;
    @Autowired
    private VehicleRepository vehicleRepository;

    @RequestMapping(value = "/admin/senderreceiver/update", method = RequestMethod.GET)
    public String querySenderReceiver(ModelMap modelMap) {
        //得到发货收货人信息表
        List<SenderReceiver> senderReceiverList = senderReceiverRepository.findAll();
        modelMap.addAttribute("senderReceiverList", senderReceiverList);

        //得到所有发货人信息
        List<Sender> senderList = senderRepository.findAll();

        int i = 0;
        int senderListSize = senderList.size();
        for (SenderReceiver sr : senderReceiverList) {
            Sender sender = senderList.get(i % senderListSize);
            sr.setSdId(sender.getSenderId());
            sr.setSenderName(sender.getSenderName());
            sr.setSenderTel(sender.getSenderTel());
            sr.setUnitType(sender.getUnitType());
            i ++;
        }
        senderReceiverRepository.save(senderReceiverList);
        return "admin/senderreceiver";
    }

    //查询车辆信息
    @RequestMapping(value = "/admin/vehicle/query", method = RequestMethod.GET)
    public String queryVehicle(ModelMap modelMap) {
        List<Vehicle> vehicleList = vehicleRepository.findAll();
        modelMap.addAttribute("vehicleList", vehicleList);

        return "admin/vehicle";
    }

}
