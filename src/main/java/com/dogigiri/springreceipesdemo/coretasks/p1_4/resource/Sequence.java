package com.dogigiri.springreceipesdemo.coretasks.p1_4.resource;

import jakarta.annotation.Resource;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@ToString
@Component
public class Sequence {

    private PrefixProvider prefixProvider;

    @Resource(name = "datePrefixProvider")
    public void setPrefixProvider(PrefixProvider prefixProvider) {
        this.prefixProvider = prefixProvider;
    }
}
