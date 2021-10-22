package org.nari.service;

import org.nari.model.Offer;

import java.util.List;

public interface OfferService {
    int addOffer(Offer offer);

    int updateOffer(Offer offer);

    int deleteOffer(Offer offer);

    int judgeOffers(List<Offer> offers);//评标

    void setWinners(List<String> offers,String biddingId);

    List<Offer> getWinners(String biddingId);

    int getPriceTurnRanking(String biddingId,String offerId);//本轮报价排名

    int getTurnOfferNum(String biddingId);//本轮参与报价厂数

    int getTurn(String biddingId);

    List<Offer> getOffersByCompany(String companyId);

    List<Offer> getOffersByBidding(String biddingId);


}
