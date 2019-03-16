package cn.jessej.springaoplearning.service;


import cn.jessej.springaoplearning.model.Order;

public interface OrderService {

    Order createOrder(String username, String product);

    Order queryOrder(String username);
}
