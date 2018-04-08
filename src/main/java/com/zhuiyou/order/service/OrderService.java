package com.zhuiyou.order.service;

import com.zhuiyou.order.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
@Transactional
public class OrderService {

    private EntityManager em;

    @Autowired
    public OrderService(EntityManager em) {
        this.em = em;
    }

    public String insert(String name) {
        Order order = new Order();
        order.setItemId(name);
        try {
            em.persist(order);
            return "ok";
        } catch (Exception e) {
            return "fail";
        }
    }
}
