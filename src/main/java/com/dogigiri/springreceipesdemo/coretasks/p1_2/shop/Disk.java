package com.dogigiri.springreceipesdemo.coretasks.p1_2.shop;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Disk extends Product {
    private final int capacity;

    public Disk(String productName, BigDecimal price, int capacity) {
        super(productName, price);
        this.capacity = capacity;
    }
}
