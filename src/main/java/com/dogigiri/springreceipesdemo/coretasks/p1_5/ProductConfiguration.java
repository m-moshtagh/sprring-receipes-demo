package com.dogigiri.springreceipesdemo.coretasks.p1_5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
@ComponentScan
public class ProductConfiguration {
    @Bean
    public Product aaa() {
        return new Battery("AAA", BigDecimal.valueOf(2.5), true);
    }

    @Bean
    public Product cd() {
        return new Disk("CD-RW", BigDecimal.valueOf(1.5), 700);
    }

    @Bean
    public Product dvd() {
        return new Disk("DVD-RW", BigDecimal.valueOf(3.0), 4900);
    }
}
