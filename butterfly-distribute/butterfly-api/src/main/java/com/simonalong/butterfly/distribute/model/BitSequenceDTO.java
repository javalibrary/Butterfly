package com.simonalong.butterfly.distribute.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author shizi
 * @since 2020/4/26 11:04 PM
 */
@Data
public class BitSequenceDTO implements Serializable {

    /**
     * 业务空间
     */
    private String namespace;
    /**
     * 41bit时间的值
     */
    private Long time;
    /**
     * 13bit的workId的值
     */
    private Integer workId;
}
