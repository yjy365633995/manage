package org.nari.controller;

import org.nari.service.OfferService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/offer")
public class OfferController {
    @Resource
    OfferService offerService;


}
