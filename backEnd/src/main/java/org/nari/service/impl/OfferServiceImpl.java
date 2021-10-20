package org.nari.service.impl;

import org.nari.mapper.OfferMapper;
import org.nari.service.OfferService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OfferServiceImpl implements OfferService {
    @Resource
    OfferMapper offerMapper;


}
