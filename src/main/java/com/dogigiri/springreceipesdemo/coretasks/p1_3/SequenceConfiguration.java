package com.dogigiri.springreceipesdemo.coretasks.p1_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PrefixConfiguration.class)
public class SequenceConfiguration {

    @Bean
    public Sequence sequenceGenerator(PrefixGenerator prefixGenerator) {
        var generator = new Sequence();
        generator.setPrefix(prefixGenerator);
        return generator;
    }
}
