package com.edu.misc;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

public class Stream {

    @Test
    public void checkStream() {
        final List<SampleModel> result = Lists.newArrayList(
                new SampleModel(1, "A", 1.0),
                new SampleModel(2, "B", 1.0),
                new SampleModel(3, "C", 1.0),
                new SampleModel(4, "D", 1.0),
                new SampleModel(4, "E", 1.0)
        );

    }

}
