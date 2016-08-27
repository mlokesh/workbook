package com.edu.group_a;

import org.junit.Test;

import java.util.Calendar;
import java.util.StringTokenizer;

public class CronParser {

    @Test
    public void shouldParseMinute() {
        final String input = "*";
        final Calendar c = Calendar.getInstance();
        final Calendar result = parseCronEntry(input, c);
    }

    private Calendar parseCronEntry(String input, Calendar c) {
        final StringTokenizer st = new StringTokenizer(input);
        while (st.hasMoreElements()) {
            final String minute = String.valueOf(st.nextElement());
            Calendar minuteEntry = parseMinute(minute, c);
        }
        return null;
    }

    private Calendar parseMinute(String minute, Calendar c) {
        if (minute == "*") {
            c.set(1, Calendar.MINUTE);
        } else {
            c.set(Integer.parseInt(minute), Calendar.MINUTE);
        }
        return c;
    }


}
