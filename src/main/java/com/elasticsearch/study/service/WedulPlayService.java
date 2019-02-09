package com.elasticsearch.study.service;

import com.elasticsearch.study.dto.WedulPlay;
import com.elasticsearch.study.repository.WedulPlayRepository;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * study
 *
 * @author wedul
 * @since 2019-02-09
 **/
@AllArgsConstructor
@NoArgsConstructor
@Service
public class WedulPlayService {

  private WedulPlayRepository wedulPlayRepository;

  public void save(WedulPlay play) {
    wedulPlayRepository.save(play);
  }

  public List<WedulPlay> findAll() {
    return Lists.newArrayList(wedulPlayRepository.findAll());
  }

  public WedulPlay findByUser(String user) {
    return wedulPlayRepository.findByUser(user);
  }

}
