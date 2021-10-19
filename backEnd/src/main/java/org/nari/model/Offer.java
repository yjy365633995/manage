package org.nari.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Offer {
    private String offerId;

    private String biddingId;

    private Integer turn;

    private String companyId;

    private Double price;

    private Integer dayNum;

    private Date deliveryDate;

    private String remark;

    private Integer priceRanking;

    private Integer qualityRanking;

    private Integer serviceRanking;

    private Integer priceScore;

    private Integer qualityScore;

    private Integer serviceScore;

    private Integer totalScore;

    private Integer winningTheBid;

    private Integer isEvaluation;

    private Integer visible;
}