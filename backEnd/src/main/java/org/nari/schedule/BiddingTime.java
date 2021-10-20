package org.nari.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BiddingTime {

    @Scheduled(fixedRate = 60000)//每分钟一次
    public void updateBiddingStatus() {

    }

}
