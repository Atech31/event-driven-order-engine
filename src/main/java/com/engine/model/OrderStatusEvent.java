package com.engine.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderStatusEvent {
    private String orderId;
    private OrderStatus status;
    private String reason;
    private LocalDateTime timestamp;
}
