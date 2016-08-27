package com.edu.misc;

import org.junit.Test;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.regex.Pattern;

public class TextParsing {

    @Test
    public void verifyParsing() {
        final String temp = "az";
        final String text = "<table border='1' cellpadding='3' cellspacing='0'>\n" +
                "    <tr><th> Character </th><th>Replacement</th></tr>\n" +
                "    <tr><td> < </td><td> &lt; </td></tr>\n" +
                "    <tr><td> > </td><td> &gt; </td></tr>";
        final StringBuilder sb = new StringBuilder();

        final StringCharacterIterator iterator = new StringCharacterIterator(temp);
        char character = iterator.current();
        while (character != CharacterIterator.DONE) {
            System.out.println(character);
            character = iterator.next();
        }

        Pattern p = Pattern.compile(temp);


    }
}
