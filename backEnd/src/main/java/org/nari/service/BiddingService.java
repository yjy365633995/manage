package org.nari.service;

import org.nari.model.Bidding;
import org.nari.vo.PageRequest;

import java.util.Date;
import java.util.List;

public interface BiddingService {
    int addBidding(Bidding bidding);

    List<Bidding> searchBiddings(PageRequest pageRequest, String biddingId, Date date,String materialCode,String materialName);

    int releaseBidding(String uuid);

    int cancelRelease(String uuid);

    int deleteBidding(String uuid);

    List<Bidding> getNotFinishedBiddings();

    int updateStatus(List<Bidding> list);
}
