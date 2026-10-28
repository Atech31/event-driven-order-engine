package com.engine.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderCreatedEvent {
    private String orderId;
    private String customerId;
    private BigDecimal totalAmount;
    private LocalDateTime timestamp;
}
