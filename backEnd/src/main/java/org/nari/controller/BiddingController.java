package org.nari.controller;

import org.nari.service.BiddingService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BiddingController {
    @Resource
    BiddingService biddingService;


}
