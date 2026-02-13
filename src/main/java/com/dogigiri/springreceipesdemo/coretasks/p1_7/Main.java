package com.dogigiri.springreceipesdemo.coretasks.p1_7;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.util.Locale;

@Slf4j
public class Main {
    private static final String MSG = "The I18N message for {} is: {}";

    void main() {
        var cfg = ProductConfiguration.class;
        try (var context = new AnnotationConfigApplicationContext(cfg)) {
            var alert = context.getMessage("alert.checkout", null, Locale.forLanguageTag("fa-IR"));
            var alertInventory = context.getMessage("alert.inventory.checkout",
                    new Object[]{"dvd", LocalDateTime.now()}, Locale.forLanguageTag("fa-IR"));
            log.info(MSG, "alert.checkout", alert);
            log.info(MSG, "alert.inventory.checkout", alertInventory);
        }
    }
}
