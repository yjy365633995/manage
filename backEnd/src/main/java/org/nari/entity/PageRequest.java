package org.nari.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PageRequest {
    private int pageNum;
    private int pageSize;
}
