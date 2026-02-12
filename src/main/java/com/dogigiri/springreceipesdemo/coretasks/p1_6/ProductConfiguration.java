package com.dogigiri.springreceipesdemo.coretasks.p1_6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

import java.math.BigDecimal;

@Configuration
@ComponentScan
@PropertySource("classpath:/coretasks/p1_6/discount.properties")
public class ProductConfiguration {

    @Value("${endofyear.discount:0.5}")
    private Double specialEndOfTheYearDiscount;

    @Value("classpath:/coretasks/p1_6/banner.txt")
    private Resource banner;

    @Bean
    public Product cd() {
        return new Disk("CD-RW", BigDecimal.valueOf(1.5), 700, specialEndOfTheYearDiscount);
    }

    @Bean
    public Product dvd() {
        return new Disk("DVD-RW", BigDecimal.valueOf(3.0), 4900, specialEndOfTheYearDiscount);
    }

    @Bean
    public BannerLoader bannerLoader() {
        return new BannerLoader(banner);
    }
}
