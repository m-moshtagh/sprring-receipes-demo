package com.dogigiri.springreceipesdemo.coretasks.p1_5;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Battery extends Product {
    private final boolean rechargeable;

    public Battery(String productName, BigDecimal price, boolean rechargeable) {
        super(productName, price);
        this.rechargeable = rechargeable;
    }
}
