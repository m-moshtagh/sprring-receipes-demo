package com.dogigiri.springreceipesdemo.coretasks.p1_5;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

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
