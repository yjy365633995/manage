package org.nari.controller;

import org.nari.entity.PageRequest;
import org.nari.entity.Result;
import org.nari.model.Bidding;
import org.nari.service.BiddingService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/bidding")
public class BiddingController {
    @Resource
    BiddingService biddingService;

    @PostMapping("/add")
    public Result add(@RequestBody Bidding bidding){

    }

    @GetMapping("/list")
    public Result list(@RequestBody PageRequest pageRequest){
        return null;
    }

}
