package org.nari.mapper;

import org.nari.model.Offer;

public interface OfferMapper {
    int insertOffer(Offer offer);

    int updateOfferById(Offer offer);

    int deleteOfferById(String offerId);
}