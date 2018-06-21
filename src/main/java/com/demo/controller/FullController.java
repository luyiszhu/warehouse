package com.demo.controller;


import com.demo.Entity.Position;
import com.demo.service.FullService;
import com.demo.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by Lenovo on 2018/6/6.
 */
@RestController
public class FullController {
    @Autowired
    private FullService fullService;

    @RequestMapping(value = "/fulls", method = RequestMethod.GET)
    public List<Position> queryPositions(@RequestParam String begin,@RequestParam String end
    ) {
        return fullService.find(begin,end);
    }
}
