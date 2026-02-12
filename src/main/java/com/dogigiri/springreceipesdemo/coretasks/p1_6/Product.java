package com.dogigiri.springreceipesdemo.coretasks.p1_6;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode
public abstract class Product {
    private final String productName;
    private final BigDecimal price;
}

