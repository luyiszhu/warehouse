package com.demo.repository;

import com.demo.Entity.Position;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by Lenovo on 2018/6/7.
 */
public interface PositionRepo extends PagingAndSortingRepository<Position, Long> {
    List<Position> findByImsiAndSavetimeBetween(String imsi,String begin,String end);
}
