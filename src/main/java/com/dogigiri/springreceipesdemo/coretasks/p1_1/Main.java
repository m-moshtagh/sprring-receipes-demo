package com.dogigiri.springreceipesdemo.coretasks.p1_1;

import com.dogigiri.springreceipesdemo.coretasks.p1_1.dao.SequenceDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {
    void main() {
        var context = new AnnotationConfigApplicationContext(SequenceConfiguration.class);
        var dao = context.getBean(SequenceDao.class);
        log.info("sequence is: {}", dao.getSequence("IT"));
        log.info("sequence next value is: {}", dao.getNextValue("IT"));
        log.info("sequence next value is: {}", dao.getNextValue("IT"));
    }
}
