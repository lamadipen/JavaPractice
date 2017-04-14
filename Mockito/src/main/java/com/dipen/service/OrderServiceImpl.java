package com.dipen.service;

import com.dipen.dao.OrderDao;

/**
 * Created by dipen on 4/13/2017.
 */
public class OrderServiceImpl implements  OrderService{

    private OrderDao orderDao;

    public boolean processOrder() {
        return orderDao.processOrder();
    }

    public OrderDao getOrderDao() {
        return orderDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
}
