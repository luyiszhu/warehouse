package com.demo.crawler;

import com.demo.Entity.Sale;
import com.demo.service.SaleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@Component
public class Crawler {

  private static final String CRAWLER_URL = "http://www.tmsf.com/index.jsp";


  @Autowired
  private RestTemplate restTemplate;
  @Autowired
  private SaleService saleService;
  @Autowired
  private SaleDataParser saleDataParser;


  public void run() {
    String html = restTemplate.getForEntity(CRAWLER_URL, String.class).getBody();
    if (StringUtils.isEmpty(html)) {
      return;
    }

    List<Sale> sales = saleDataParser.parse(html);

    if (CollectionUtils.isEmpty(sales)) {
      return;
    }
//
//    saleService.save(sales);
  }

}
