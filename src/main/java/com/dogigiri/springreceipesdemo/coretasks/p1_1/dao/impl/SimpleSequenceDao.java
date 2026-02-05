package com.dogigiri.springreceipesdemo.coretasks.p1_1.dao.impl;

import com.dogigiri.springreceipesdemo.coretasks.p1_1.dao.SequenceDao;
import com.dogigiri.springreceipesdemo.coretasks.p1_1.dto.Sequence;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class SimpleSequenceDao implements SequenceDao {

    private final Map<String, Sequence> sequences = new ConcurrentHashMap<>();
    private final Map<String, AtomicInteger> values = new ConcurrentHashMap<>();

    public SimpleSequenceDao() {
        sequences.put("IT", new Sequence("IT", "30", "A"));
        values.put("IT", new AtomicInteger(10000));
    }

    @Override
    public Sequence getSequence(String sequenceId) {
        return sequences.get(sequenceId);
    }

    @Override
    public int getNextValue(String sequenceId) {
        return values.get(sequenceId).getAndIncrement();
    }
}
