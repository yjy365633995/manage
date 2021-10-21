package org.nari.schedule;

import org.nari.service.BiddingService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BiddingTime {
    @Resource
    BiddingService biddingService;

    @Scheduled(fixedRate = 60000)//每分钟一次
    public void updateBiddingStatus() {
        biddingService.getNotFinishedBiddings();
    }

}
