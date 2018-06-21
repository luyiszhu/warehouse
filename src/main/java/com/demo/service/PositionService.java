package com.demo.service;

import com.demo.Entity.Position;
import com.demo.repository.PositionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Lenovo on 2018/6/6.
 */
@Service
public class PositionService {
    @Autowired
    private PositionRepo positionRepo;


    public List<Position> find(String imsi,String begin,String end) {
        return positionRepo.findByImsiAndSavetimeBetween(imsi,begin,end);
    }
}
