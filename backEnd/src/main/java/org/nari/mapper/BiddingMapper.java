package org.nari.mapper;

import org.nari.model.Bidding;

import java.util.List;

public interface BiddingMapper {
    int insertBidding(Bidding bidding);

    Bidding getBiddingById(String uuid);

    Bidding getBiddingByBid(String biddingId);

    List<Bidding> getAll();

    List<Bidding> getBiddingByStatus(Integer status);

    int updateBiddingById(Bidding bidding);

    int deleteById(String bid);
}