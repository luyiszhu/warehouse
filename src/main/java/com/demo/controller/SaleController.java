package com.demo.controller;

import com.demo.Entity.Sale;
import com.demo.service.SaleService;

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
public class SaleController {

  @Autowired
  private SaleService saleService;

  @RequestMapping(value = "/sales", method = RequestMethod.GET)
  public List<String[]> querySales(@RequestParam String lon,
                                   @RequestParam String lat,
                                   @RequestParam String firsttime,
                                   @RequestParam String lasttime
  ) {

    return saleService.find(lon,lat, firsttime,lasttime);
  }

}
