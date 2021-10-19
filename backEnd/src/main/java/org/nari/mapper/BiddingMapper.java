package org.nari.mapper;

import org.nari.model.Bidding;

public interface BiddingMapper {
    int insertBidding(Bidding bidding);

    int updateBiddingById(Bidding bidding);

    int deleteById(String bid);
}