package com.dogigiri.springreceipesdemo.coretasks.p1_1.dao;

import com.dogigiri.springreceipesdemo.coretasks.p1_1.dto.Sequence;

public interface SequenceDao {
    Sequence getSequence(String sequenceId);

    int getNextValue(String sequenceId);
}
