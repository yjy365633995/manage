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

    int updateOfferById(Offer offer);

    int deleteOfferById(String offerId);
}