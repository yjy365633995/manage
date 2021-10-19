package org.nari.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bidding {
    private String uuid;

    private String biddingId;

    private Date startTime;

    private String materialId;

    private String materialName;

    private String materialStandard;

    private Double weight;

    private String unit;

    private Integer num;

    private Date deliveryDate;

    private String adjuncts;

    private String adjunctsName;

    private String materialRequirement;

    private String biddingCompany;

    private Integer turnNum;

    private Integer turnTimeMinute;

    private Integer status;

    private Integer visible;

}