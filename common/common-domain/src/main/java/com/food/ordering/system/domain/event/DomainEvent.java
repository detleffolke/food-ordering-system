package com.food.ordering.system.domain.event;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;

public interface DomainEvent<T> {
    void fire();
}
