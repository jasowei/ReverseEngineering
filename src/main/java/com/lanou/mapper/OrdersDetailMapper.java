package com.lanou.mapper;

import com.lanou.domain.OrdersDetail;

public interface OrdersDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrdersDetail record);

    int insertSelective(OrdersDetail record);

    OrdersDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrdersDetail record);

    int updateByPrimaryKey(OrdersDetail record);
}