package com.dogigiri.springreceipesdemo.coretasks.p1_6;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;

@Slf4j
public class Main {
    void main() throws IOException {
        try (var context = new AnnotationConfigApplicationContext(ProductConfiguration.class)) {
            var dvd = context.getBean("dvd", Product.class);
            log.info("the product info is: {}", dvd);

            var classPathResource = new ClassPathResource("/coretasks/p1_6/customer.properties");
            var props = PropertiesLoaderUtils.loadProperties(classPathResource);
            log.info("The customer is: {}", props);
        }
    }
}
