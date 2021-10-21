package org.nari.service;

import org.nari.model.Bidding;

import java.util.List;

public interface BiddingService {
    int addBidding(Bidding bidding);

    int releaseBidding(String uuid);;

    int cancelRelease(String uuid);

    int deleteBidding(String uuid);

    List<Bidding> getNotFinishedBiddings();

    int updateStatus(List<Bidding> list);
}
