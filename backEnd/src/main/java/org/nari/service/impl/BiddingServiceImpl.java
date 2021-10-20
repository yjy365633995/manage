package org.nari.service.impl;

import org.nari.mapper.BiddingMapper;
import org.nari.service.BiddingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BiddingServiceImpl implements BiddingService {
    @Resource
    BiddingMapper biddingMapper;


}
