package com.dogigiri.springreceipesdemo.coretasks.p1_5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {
    void main() {
        try (var context = new AnnotationConfigApplicationContext(ProductConfiguration.class)) {
            var aaa = context.getBean("aaa", Product.class);
            var cd = context.getBean("cd", Product.class);
            var dvd = context.getBean("dvd", Product.class);

            var kart1 = context.getBean(ShoppingKart.class);
            kart1.addItem(aaa);
            kart1.addItem(cd);
            log.info("kart1 has items: {}", kart1.getItems());

            var kart2 = context.getBean(ShoppingKart.class);
            kart2.addItem(dvd);
            log.info("kart2 has items: {}", kart2.getItems());
        }
    }
}
