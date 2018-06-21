package com.demo.crawler;

import com.google.common.collect.Lists;

import com.demo.Entity.Sale;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

/**
 * @author lepdou 2017-06-18
 */
@Component
public class SaleDataParser {
  private static final Map<String, String> classNameMapNum = new HashMap();
  private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

  @PostConstruct
  public void init() {
    classNameMapNum.put("numbzero", "0");
    classNameMapNum.put("numbone", "1");
    classNameMapNum.put("numbtwo", "2");
    classNameMapNum.put("numbthree", "3");
    classNameMapNum.put("numbfour", "4");
    classNameMapNum.put("numbfive", "5");
    classNameMapNum.put("numbsix", "6");
    classNameMapNum.put("numbseven", "7");
    classNameMapNum.put("numbeight", "8");
    classNameMapNum.put("numbnine", "9");
    classNameMapNum.put("numbdor", ".");
  }

  public List<Sale> parse(String html) {


    List<Sale> sales = Lists.newArrayList();
    return sales;
  }

  private Sale parse(Element element) {


    Sale sale = new Sale();
    return sale;
  }

  private String parseHouseName(Element e) {
    return e.getElementsByTag("a").get(0).text();
  }


}
