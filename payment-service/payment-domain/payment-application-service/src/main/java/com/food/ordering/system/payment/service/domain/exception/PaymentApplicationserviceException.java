package com.food.ordering.system.payment.service.domain.exception;

import com.food.ordering.system.domain.exception.DomainException;

public class PaymentApplicationserviceException  extends DomainException {
    public PaymentApplicationserviceException(String message) {
        super(message);
    }

    public PaymentApplicationserviceException(String message, Throwable cause) {
        super(message, cause);
    }
}
