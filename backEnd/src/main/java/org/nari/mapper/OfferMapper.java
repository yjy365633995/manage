package org.nari.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.nari.model.Offer;

import java.util.List;

@Mapper
public interface OfferMapper {
    int insertOffer(Offer offer);

    Offer getOfferById(String offerId);

    List<Offer> getOffersByBiddingId(String biddingId);

    List<Offer> getOffersByUserId(String companyId);

    List<Offer> getAll();

    List<Offer> getWinners(String biddingId);

    List<Offer> getOffersByCompany(String companyId);

    int updateOfferById(Offer offer);

    int judgeOffersBatch(List<Offer> offers);

    int deleteOfferById(String offerId);


}