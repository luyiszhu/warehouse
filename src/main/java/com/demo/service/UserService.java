package com.demo.service;

import com.demo.Entity.User;
import com.demo.repository.UserRepo;
import com.demo.util.DateUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

//  @Transactional
//  public void save(List<Sale> sales) {
//    String createDate = sales.get(0).getCreateDate();
//    saleRepo.deleteByCreateDate(createDate);
//    saleRepo.save(sales);
//  }

    public Integer find(String username, String password) {

        List<User> userlist = userRepo.findByUsernameAndPassword(username, password);
        if (userlist.size() > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
