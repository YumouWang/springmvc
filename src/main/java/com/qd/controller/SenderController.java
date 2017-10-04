package com.qd.controller;

import com.qd.model.Sender;
import com.qd.repository.SenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class SenderController {
    @Autowired
    private SenderRepository senderRepository;

    @RequestMapping(value = "/admin/senders/queryByProductType", method = RequestMethod.GET)
    public String querySenderByProductType(ModelMap modelMap) {
        List<Sender> senderList = senderRepository.selectSender("阀门");
        modelMap.addAttribute("senderList", senderList);
        return "admin/senders";
    }

    @RequestMapping(value = "/admin/senders/query", method = RequestMethod.GET)
    public String querySender(ModelMap modelMap) {
        List<Sender> senderList = senderRepository.findAll();
        modelMap.addAttribute("senderList", senderList);
        return "admin/senders";
    }

}
