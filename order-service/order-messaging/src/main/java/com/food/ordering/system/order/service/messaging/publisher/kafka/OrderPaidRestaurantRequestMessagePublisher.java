package com.food.ordering.system.order.service.messaging.publisher.kafka;

import com.food.ordering.system.order.service.domain.event.OrderPaidEvent;

public interface OrderPaidRestaurantRequestMessagePublisher {
    void publish(OrderPaidEvent domainEvent);
}
