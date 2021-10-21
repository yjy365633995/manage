package org.nari.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BiddingSearch {
    private int pageNum;
    private int pageSize;
    private String biddingId;
    private String startTime;
    private String materialCode;
    private String materialName;
}
