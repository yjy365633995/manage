package org.nari.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.nari.model.Bidding;

import java.util.List;

@Mapper
public interface BiddingMapper {
    int insertBidding(Bidding bidding);

    Bidding getBiddingById(String uuid);

    Bidding getBiddingByBid(String biddingId);

    List<Bidding> getAll();

    List<Bidding> getBiddingByStatus(Integer status);

    int updateBiddingById(Bidding bidding);

    int updateStatus(Bidding bidding);

    int updateStatusBatch(List<Bidding> biddings);

    int deleteById(String bid);
}