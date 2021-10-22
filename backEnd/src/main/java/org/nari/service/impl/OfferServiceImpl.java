package org.nari.service.impl;

import org.nari.mapper.BiddingMapper;
import org.nari.mapper.OfferMapper;
import org.nari.model.Bidding;
import org.nari.model.Offer;
import org.nari.service.OfferService;
import org.nari.util.TimeUtil;
import org.nari.util.UUID;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class OfferServiceImpl implements OfferService {
    @Resource
    OfferMapper offerMapper;
    @Resource
    BiddingMapper biddingMapper;


    @Override
    public int addOffer(Offer offer) {
        offer.setOfferId(UUID.getUUID());
        return offerMapper.insertOffer(offer);
    }

    @Override
    public int updateOffer(Offer offer) {
        return offerMapper.updateOfferById(offer);
    }

    @Override
    public int deleteOffer(Offer offer) {
        return offerMapper.deleteOfferById(offer.getOfferId());
    }

    @Override
    public int judgeOffers(List<Offer> list) {
        list.forEach(e->e.setIsEvaluation(Offer.IsEvaluation.YES.ordinal()));
        return offerMapper.judgeOffersBatch(list);
    }

    @Override
    public void setWinners(List<String> offers, String biddingId) {
        //TODO
    }

    @Override
    public List<Offer> getWinners(String biddingId) {
        return offerMapper.getWinners(biddingId);
    }

    @Override
    public int getPriceTurnRanking(String biddingId, String offerId) {
        Offer offer = offerMapper.getOfferById(offerId);
        List<Offer> list = offerMapper.getOffersByBiddingId(biddingId);
        int rank = 1;
        for(Offer o:list)
            if(o.getTurn().equals(offer.getTurn()))//同一轮
                if(o.getPrice().compareTo(offer.getPrice())>0)//价格比自己高
                    rank++;

        return rank;
    }

    @Override
    public int getTurnOfferNum(String biddingId) {
        int turn = getTurn(biddingId);

        List<Offer> list = offerMapper.getOffersByBiddingId(biddingId);
        int total = 0;

        for(Offer o:list)
            if(turn == o.getTurn())
                total++;
        return total;
    }

    @Override
    public int getTurn(String biddingId) {
        Bidding bidding = biddingMapper.getBiddingByBid(biddingId);
        Date start = bidding.getStartTime();
        Date cur = TimeUtil.getCurDate();
        int totalTurn = bidding.getTurnNum();

        int turn = 1;
        while(totalTurn-->0){
            start = TimeUtil.plusMinute(start,bidding.getTurnTimeMinute());
            if(start.compareTo(cur)>0){
                break;
            }else
                turn++;
        }

        return turn;
    }


    @Override
    public List<Offer> getOffersByCompany(String companyId) {
        return offerMapper.getOffersByCompany(companyId);
    }

    @Override
    public List<Offer> getOffersByBidding(String biddingId) {
        return offerMapper.getOffersByBiddingId(biddingId);
    }
}
