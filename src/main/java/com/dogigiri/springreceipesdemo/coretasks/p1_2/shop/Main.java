package com.dogigiri.springreceipesdemo.coretasks.p1_2.shop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {
    void main() {
        try (var context = new AnnotationConfigApplicationContext(ProductConfiguration.class)) {
            var aaa = context.getBean("aaa", Product.class);
            var cd = context.getBean("cd", Product.class);
            log.info("The battery product is: {}", aaa);
            log.info("The CD product is: {}", cd);
        }
    }
}
