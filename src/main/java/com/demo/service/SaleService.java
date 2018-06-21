package com.demo.service;

import com.demo.Entity.Sale;
import com.demo.repository.SaleRepo;
import com.demo.util.DateUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * @author lepdou 2017-06-18
 */
@Service
public class SaleService {

  @Autowired
  private SaleRepo saleRepo;

//  @Transactional
//  public void save(List<Sale> sales) {
//    String createDate = sales.get(0).getCreateDate();
//    saleRepo.deleteByCreateDate(createDate);
//    saleRepo.save(sales);
//  }

  public List<String[]> find(String lon,String lat,String firsttime,String lasttime) {
    String base = "2017-04-17+00:00";
    String[] first = firsttime.split("-");
    String[] firsts = first[2].split(" ");
    String[] firstss = firsts[1].split(":");
    int ftime = (Integer.parseInt(firsts[0]) - 17) * 3600 * 24 + (Integer.parseInt(firstss[0])) * 3600 + (Integer.parseInt(firstss[1])) * 60;

    String[] last = lasttime.split("-");
    String[] lasts = last[2].split(" ");
    String[] lastss = lasts[1].split(":");
    int ltime = (Integer.parseInt(lasts[0]) - 17) * 3600 * 24 + (Integer.parseInt(lastss[0])) * 3600 + (Integer.parseInt(lastss[1])) * 60;





    List<Sale> list =  saleRepo.findByTimeBetween(ftime,ltime);

    HashMap<Integer,Double> h = new HashMap<Integer,Double>();
    double PI = Math.PI;
    int R = 6371004;
    double x1 = Double.parseDouble(lon);
    double y1 = Double.parseDouble(lat);
    for(int i=0;i<list.size();i++)
    {
      double x2 = list.get(i).getLon();
      double y2 = list.get(i).getLat();
      double RADIUS = 6378.137;
      double radLat1 = Math.PI * y1 / 180.0;
      double radLat2 = Math.PI * y2 / 180.0;
      double a = radLat2 - radLat1;
      double b = Math.PI * x2 / 180.0 - Math.PI * x1 / 180.0;
      double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
      double distance = s * RADIUS * 1000;
      h.put(i,distance);
    }
    List<Map.Entry<Integer, Double>> sortedlist = new ArrayList<Map.Entry<Integer, Double>>(h.entrySet());
    Collections.sort(sortedlist, new Comparator<Map.Entry<Integer, Double>>() {

      public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
        return o1.getValue().compareTo(o2.getValue());
      }
    });

    HashSet<String> phone =  new HashSet<String>();
    List<String[]> res = new ArrayList<String[]>();
    for (Map.Entry<Integer, Double> mapping : sortedlist) {
      String mdn = list.get(mapping.getKey()).getMdn() ;
      if(!phone.contains(mdn))
      {
        phone.add(mdn);
        res.add(new String[]{mdn,list.get(mapping.getKey()).getLon()+"",list.get(mapping.getKey()).getLat()+"",""+Math.floor(mapping.getValue())});
        if(phone.size() >= 5)
          break;
      }

    }
    return res;
  }
}
