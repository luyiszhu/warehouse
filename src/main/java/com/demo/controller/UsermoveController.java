package com.demo.controller;

import com.demo.Entity.Usermove;
import com.demo.service.UsermoveService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@RestController
public class UsermoveController {

    @Autowired
    private UsermoveService usermoveService;

    @RequestMapping(value = "/usermoves", method = RequestMethod.GET)
    public List<String[]> queryUsermoves(@RequestParam String mdn,
                                         @RequestParam String firsttime,
                                         @RequestParam String lasttime
    ) {

        return usermoveService.find(mdn, firsttime,lasttime);
    }

}
