package com.dogigiri.springreceipesdemo.coretasks.p1_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrefixConfiguration {
    @Bean
    public DatePrefixGenerator datePrefixGenerator() {
        return new DatePrefixGenerator("YYYY");
    }
}
