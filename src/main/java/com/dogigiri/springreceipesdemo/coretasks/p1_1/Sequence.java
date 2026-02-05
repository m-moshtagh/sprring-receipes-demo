package com.dogigiri.springreceipesdemo.coretasks.p1_1;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;


public class Sequence {
    private final AtomicInteger counter = new AtomicInteger();
    @Getter
    @Setter
    private String prefix;
    @Getter
    @Setter
    private String suffix;

    public void setInitial(int initial) {
        this.counter.set(initial);
    }

    public String nextValue() {
        return prefix + counter.getAndIncrement() + suffix;
    }
}
