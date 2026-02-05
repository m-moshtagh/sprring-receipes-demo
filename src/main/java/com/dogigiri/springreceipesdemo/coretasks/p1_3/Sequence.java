package com.dogigiri.springreceipesdemo.coretasks.p1_3;

import lombok.Getter;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


public class Sequence {
    @Getter
    private PrefixGenerator prefix;

    @Autowired(required = false)
    public void setPrefix(PrefixGenerator prefix) {
        this.prefix = prefix;
    }

    @Autowired
    public void setPrefix(Optional<PrefixGenerator> prefix) {
        this.prefix = prefix.orElse(null);
    }

    @Autowired
    public void setPrefix(ObjectProvider<PrefixGenerator> prefix) {
        this.prefix = prefix.getIfUnique();
    }
}
