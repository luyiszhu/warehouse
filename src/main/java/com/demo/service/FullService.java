package com.demo.service;

import com.demo.Entity.Position;
import com.demo.repository.FullRepo;
import com.demo.repository.PositionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Lenovo on 2018/6/6.
 */
@Service
public class FullService {
    @Autowired
    private FullRepo fullRepo;


    public List<Position> find(String begin,String end) {
        return fullRepo.findBySavetimeBetween(begin,end);
    }
}
