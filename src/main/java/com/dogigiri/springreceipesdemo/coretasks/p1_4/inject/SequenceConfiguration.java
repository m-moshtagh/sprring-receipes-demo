package com.dogigiri.springreceipesdemo.coretasks.p1_4.inject;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        includeFilters = @ComponentScan.Filter(type = FilterType.REGEX,
                pattern = {"com.dogigiri.springreceipesdemo.coretasks.p1_4.*"})
)
public class SequenceConfiguration {
}
