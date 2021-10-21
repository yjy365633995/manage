package org.nari.service.impl;

import org.nari.mapper.BiddingMapper;
import org.nari.model.Bidding;
import org.nari.service.BiddingService;
import org.nari.util.UUID;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BiddingServiceImpl implements BiddingService {
    @Resource
    BiddingMapper biddingMapper;

    @Override
    public int addBidding(Bidding bidding) {
        bidding.setUnit(UUID.getUUID());
        bidding.setStatus(Bidding.Status.NotStarted.ordinal());
        bidding.setVisible(Bidding.Visible.Draft.ordinal());
        return biddingMapper.insertBidding(bidding);
    }

    @Override
    public int releaseBidding(String uuid) {
        Bidding bidding = new Bidding();
        bidding.setUuid(uuid);
        bidding.setStatus(Bidding.Visible.Release.ordinal());
        return biddingMapper.updateStatus(bidding);
    }

    @Override
    public int cancelRelease(String uuid) {
        Bidding bidding = biddingMapper.getBiddingById(uuid);
        if(bidding.getStatus() != Bidding.Status.NotStarted.ordinal())
            return 0;
        bidding.setVisible(Bidding.Visible.Draft.ordinal());
        return biddingMapper.updateStatus(bidding);
    }

    @Override
    public int deleteBidding(String uuid) {
        return biddingMapper.deleteById(uuid);
    }

    @Override
    public List<Bidding> getNotFinishedBiddings() {
        return biddingMapper.getBiddingsExcludeStatus(Bidding.Status.Finished.ordinal());
    }

    @Override
    public int updateStatus(List<Bidding> list) {
        if(null!=list && list.size()!=0)
            return biddingMapper.updateStatusBatch(list);
        return 0;
    }
}
