package org.nari.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PageRequest {
    private int pageNum;
    private int pageSize;
}
