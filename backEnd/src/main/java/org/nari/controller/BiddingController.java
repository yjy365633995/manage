package org.nari.controller;

import org.nari.service.BiddingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/bidding")
public class BiddingController {
    @Resource
    BiddingService biddingService;


}
