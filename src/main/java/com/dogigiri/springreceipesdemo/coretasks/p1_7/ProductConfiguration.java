package com.dogigiri.springreceipesdemo.coretasks.p1_7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class ProductConfiguration {

    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {
        var messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:coretasks/p1_7/messages");
        messageSource.setCacheSeconds(1);
        return messageSource;
    }
}
