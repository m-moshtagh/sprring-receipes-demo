package com.dogigiri.springreceipesdemo.coretasks.p1_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(
        includeFilters = @ComponentScan.Filter(type = FilterType.REGEX,
                pattern = {
                        "com.dogigiri.springreceipesdemo.coretasks.p1_1.*Dao",
                        "com.dogigiri.springreceipesdemo.coretasks.p1_1.*Service"
                }),
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
                classes = {Controller.class})
)
public class SequenceConfiguration {

    @Bean
    public Sequence getSequence() {
        var sequence = new Sequence();
        sequence.setInitial(10000);
        sequence.setPrefix("30");
        sequence.setSuffix("A");
        return sequence;
    }
}
