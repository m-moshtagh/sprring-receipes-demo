package com.dogigiri.springreceipesdemo.coretasks.p1_6;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Disk extends Product {
    private final int capacity;
    private final double discount;

    public Disk(String productName, BigDecimal price, Integer capacity, Double discount) {
        super(productName, price);
        this.capacity = capacity;
        this.discount = discount;
    }
}
