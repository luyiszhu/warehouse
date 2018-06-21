package com.demo.repository;

import com.demo.Entity.User;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UserRepo extends PagingAndSortingRepository<User, Long> {

//  void deleteByCreateDate(String createDate);

    List<User> findByUsernameAndPassword(String username,String password);
}
