package org.nari.service;

import org.nari.model.Bidding;

import java.util.List;

public interface BiddingService {
    void addBidding(Bidding bidding);

    void releaseBidding(String biddingId);

    void cancelRelease(String biddingId);

    List<Bidding> getNotFinishedBiddings();

    void updateStatus(List<Bidding> list);
}
