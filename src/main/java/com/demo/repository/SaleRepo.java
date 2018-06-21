package com.demo.repository;

import com.demo.Entity.Sale;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface SaleRepo extends PagingAndSortingRepository<Sale, Long> {

//  void deleteByCreateDate(String createDate);

  List<Sale> findByTimeBetween(int firsttime,int lasttime);
}
