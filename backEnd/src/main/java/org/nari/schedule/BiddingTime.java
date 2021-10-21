package org.nari.schedule;

import org.nari.model.Bidding;
import org.nari.service.BiddingService;
import org.nari.util.TimeUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class BiddingTime {
    @Resource
    BiddingService biddingService;

    @Scheduled(fixedRate = TimeUtil.MINUTE)//每分钟一次
    public void updateBiddingStatus() {
        Date cur = TimeUtil.getCurDate();
        List<Bidding> list = biddingService.getNotFinishedBiddings();
        List<Bidding> toUpdate = new ArrayList<>();
        if(null!=list && list.size()!=0){
            list.forEach(bidding -> {
                Date begin = bidding.getStartTime();
//                System.out.println(bidding.getTurnNum());
//                System.out.println(bidding.getTurnTimeMinute());
                Date end = TimeUtil.plusMinute(begin,bidding.getTurnNum()*bidding.getTurnTimeMinute());

                if(end.compareTo(cur) < 0){
                    bidding.setStatus(Bidding.Status.Finished.ordinal());
                    toUpdate.add(bidding);
                }else if(bidding.getStatus()!=Bidding.Status.InProgress.ordinal() && cur.compareTo(begin) > 0) {
                    bidding.setStatus(Bidding.Status.InProgress.ordinal());
                    toUpdate.add(bidding);
                }

            });
            if(toUpdate.size()!=0)
                biddingService.updateStatus(list);
        }


    }

}
