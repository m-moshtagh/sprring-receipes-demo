package com.dogigiri.springreceipesdemo.coretasks.p1_4.inject;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class Sequence {

    private PrefixProvider prefixProvider;

    @Inject
    public Sequence(@Named("simplePrefixProvider") PrefixProvider prefixProvider) {
        this.prefixProvider = prefixProvider;
    }
}
