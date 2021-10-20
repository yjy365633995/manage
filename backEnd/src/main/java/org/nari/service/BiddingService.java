package org.nari.service;

import org.nari.model.Bidding;

public interface BiddingService {
    void addBidding(Bidding bidding);

    void releaseBidding(String biddingId);

    void cancelRelease(String biddingId);



}
