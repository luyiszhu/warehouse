package com.demo.repository;

import com.demo.Entity.Usermove;


import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UsermoveRepo extends PagingAndSortingRepository<Usermove, Long> {

//  void deleteByCreateDate(String createDate);

    List<Usermove> findByMdnAndTimeBetween(String mdn,int firsttime,int lasttime);
}
