package org.nari.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BiddingSearch {
    private int pageNum;
    private int pageSize;
    private String biddingId;
    private Date startTime;
    private String materialCode;
    private String materialName;
}
