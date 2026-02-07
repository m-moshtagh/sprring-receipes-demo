package com.dogigiri.springreceipesdemo.coretasks.p1_4.inject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {
    void main() {
        var context = new AnnotationConfigApplicationContext(SequenceConfiguration.class);
        var sequence = context.getBean(Sequence.class);
        log.info("The sequence bean is: {}", sequence);

    }
}
