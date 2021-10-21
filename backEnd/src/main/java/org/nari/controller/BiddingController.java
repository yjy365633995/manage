package org.nari.controller;

import org.nari.vo.PageRequest;
import org.nari.vo.Result;
import org.nari.model.Bidding;
import org.nari.service.BiddingService;
import org.nari.vo.BiddingSearch;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/bidding")
public class BiddingController {
    @Resource
    BiddingService biddingService;

    @PostMapping("/add")
    public Result add(@RequestBody Bidding bidding){
        return biddingService.addBidding(bidding)>0? Result.success():Result.error("添加失败");
    }

    @GetMapping("/list")
    public Result list(@RequestBody BiddingSearch biddingSearch){
        return null;
    }

    @DeleteMapping("/delete")
    public Result del(String uuid){
        return biddingService.deleteBidding(uuid)>0? Result.success():Result.error("删除失败");
    }

    @PostMapping("/draft")
    public Result draft(String uuid){
        return biddingService.cancelRelease(uuid)>0? Result.success():Result.error("更新失败");
    }

    @PostMapping("/release")
    public Result release(String uuid){
        return biddingService.releaseBidding(uuid)>0? Result.success():Result.error("更新失败");
    }


}
