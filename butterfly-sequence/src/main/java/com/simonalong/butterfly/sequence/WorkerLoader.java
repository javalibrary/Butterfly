package com.simonalong.butterfly.sequence;

import com.simonalong.butterfly.sequence.spi.WorkerIdHandler;

/**
 * @author shizi
 * @since 2020/4/9 12:38 AM
 */
public interface WorkerLoader {

    /**
     * 是否是默认
     *
     * @return true: 是默认，false：不是默认
     */
    default Boolean isDefault() {
        return false;
    }

    /**
     * 是否接收对应的配置
     *
     * @param butterflyConfig 发号器对应的配置
     * @return true：接受，false：不接受
     */
    Boolean configAvailable(ButterflyConfig butterflyConfig);

    /**
     * 获取workerId的实例
     *
     * @param namespace       命名空间
     * @param butterflyConfig 具体的配置
     * @return workerId处理器
     */
    WorkerIdHandler loadIdHandler(String namespace, ButterflyConfig butterflyConfig);
}