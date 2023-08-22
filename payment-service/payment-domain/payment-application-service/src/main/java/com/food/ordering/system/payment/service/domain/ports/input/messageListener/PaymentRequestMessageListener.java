package com.food.ordering.system.payment.service.domain.ports.input.messageListener;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.payment.service.domain.dto.PaymentRequest;
import com.food.ordering.system.payment.service.domain.event.PaymentFailedEvent;
import com.food.ordering.system.payment.service.domain.ports.output.message.publisher.PaymentFailedMessagePublisher;

public interface PaymentRequestMessageListener {

    void completePayment(PaymentRequest paymentRequest, DomainEventPublisher<PaymentFailedEvent> paymentFailedEventDomainEventPublisher);

    void cancelPayment(PaymentRequest paymentRequest, PaymentFailedMessagePublisher paymentFailedEventDomainEventPublisher);
}
