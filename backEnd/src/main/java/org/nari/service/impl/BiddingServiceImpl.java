package org.nari.service.impl;

import org.nari.mapper.BiddingMapper;
import org.nari.model.Bidding;
import org.nari.service.BiddingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BiddingServiceImpl implements BiddingService {
    @Resource
    BiddingMapper biddingMapper;


    @Override
    public void addBidding(Bidding bidding) {

    }

    @Override
    public void releaseBidding(String biddingId) {

    }

    @Override
    public void cancelRelease(String biddingId) {

    }

    @Override
    public List<Bidding> getNotFinishedBiddings() {

        return biddingMapper.getBiddingsExcludeStatus(Bidding.Status.Finished.ordinal());
    }

    @Override
    public void updateStatus(List<Bidding> list) {
        if(null!=list && list.size()!=0)
            biddingMapper.updateStatusBatch(list);
    }
}
