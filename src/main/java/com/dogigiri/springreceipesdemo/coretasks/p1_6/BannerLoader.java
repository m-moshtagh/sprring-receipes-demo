package com.dogigiri.springreceipesdemo.coretasks.p1_6;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@AllArgsConstructor
public class BannerLoader {
    private final Resource banner;

    @PostConstruct
    public void showBanner() throws IOException {
        var path = Path.of(banner.getURI());
        try (var lines = Files.lines(path, StandardCharsets.UTF_8)) {
            lines.forEachOrdered(System.out::println);
        }
    }
}
