package com.dogigiri.springreceipesdemo.coretasks.p1_3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class DatePrefixGenerator implements PrefixGenerator {
    private String prefix;

}
