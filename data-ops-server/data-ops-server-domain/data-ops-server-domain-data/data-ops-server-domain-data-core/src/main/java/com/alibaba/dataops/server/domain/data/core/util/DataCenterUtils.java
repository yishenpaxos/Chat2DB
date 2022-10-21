package com.alibaba.dataops.server.domain.data.core.util;

import java.util.Map;

import com.alibaba.dataops.server.domain.data.core.model.DataSourceWrapper;
import com.alibaba.dataops.server.domain.data.core.model.JdbcDataTemplate;

import com.google.common.collect.Maps;

/**
 * 用来存储连接等数据
 *
 * @author 是仪
 */
public class DataCenterUtils {

    /**
     * 数据源
     * key: dataSourceId
     */
    public static final Map<Long, DataSourceWrapper> DATA_SOURCE_CACHE = Maps.newConcurrentMap();

    /**
     * 数据执行模板列表
     * key: dataSourceId
     */
    public static final Map<Long, Map<Long, JdbcDataTemplate>> JDBC_TEMPLATE_CACHE = Maps.newConcurrentMap();

}
