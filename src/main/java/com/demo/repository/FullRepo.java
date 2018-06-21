package com.demo.repository;

import com.demo.Entity.Position;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by Lenovo on 2018/6/7.
 */
public interface FullRepo extends PagingAndSortingRepository<Position, Long> {
    List<Position> findBySavetimeBetween(String begin,String end);
}
