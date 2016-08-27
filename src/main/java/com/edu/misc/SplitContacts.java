package com.edu.misc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SplitContacts {

    public static void main(String args[]) throws IOException {

        Set<String> emailAddresses = new HashSet<String>();

        File inputFile = new File("/Users/mahadevl/Downloads/Internet/Temp", "shopcontacts.txt");
        final FileInputStream fStream = new FileInputStream(inputFile);

        DataInputStream in = new DataInputStream(fStream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        File outputFile = new File("/Users/mahadevl/Downloads/Internet/Temp", "shopcontacts_output.txt");
        final FileWriter sWriter = new FileWriter(outputFile);

        BufferedWriter out = new BufferedWriter(sWriter);
        out.flush();

        String strLine;

        while ((strLine = br.readLine()) != null) {
            emailAddresses.addAll(Arrays.asList(strLine.split("\\s*,\\s*")));
        }

        in.close();
        br.close();

        for (String email : emailAddresses) {
            out.write("insert into temp_shopcontacts values ('" + email.trim() + "');");
            out.newLine();
        }
        System.out.println(emailAddresses.size());
        out.close();
    }

}
