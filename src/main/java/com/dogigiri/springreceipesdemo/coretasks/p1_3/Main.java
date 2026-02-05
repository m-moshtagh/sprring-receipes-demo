package com.dogigiri.springreceipesdemo.coretasks.p1_3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {
    void main() {
        var context = new AnnotationConfigApplicationContext(SequenceConfiguration.class);
        var bean = context.getBean(Sequence.class);
        log.info("bean is: {}", bean);
    }
}
