package org.nari.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.nari.model.Bidding;

import java.util.Date;
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

    int updateStatusBatch(@Param("list") List<Bidding> biddings);

    int deleteById(String bid);

    List<Bidding> getBiddingsExcludeStatus(Integer status);

    List<Bidding> searchBiddings(@Param("biddingId") String biddingId, @Param("date") Date date,
                                 @Param("materialCode") String materialCode,@Param("materialName") String materialName);
}