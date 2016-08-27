package com.edu.io;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class IOExample {

    private String readPath = "src/test/java/com/personal/edu/io/sample.txt";
    private String writePath = "src/test/java/com/personal/edu/io/sampleWrite.txt";


    private void readerOne() {
        BufferedReader br;
        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader(readPath));
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readerTwo() throws IOException {
        final FileInputStream fs = new FileInputStream(readPath);
        final BufferedReader br = new BufferedReader(new InputStreamReader(fs));
        String currentLine;
        while ((currentLine = br.readLine()) != null) {
//            Scanner scanner = new Scanner(currentLine);
//            scanner.useDelimiter("-");
//            scanner.next();
//            scanner.next();
            System.out.println(currentLine);
        }
    }

    private void readerThree() throws IOException {
        final File f = new File(readPath);
        final Scanner scanner = new Scanner(f);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

    }

    @Test
    public void readFile() throws IOException {
        readerOne();
        readerTwo();
        readerThree();
    }

    @Test
    public void writeFile() throws Exception {
        writeToFile();
    }

    public void writeToFile() throws Exception {
        File fout = new File(writePath);
        FileOutputStream fos = new FileOutputStream(fout);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        bw.write("AAA");

        bw.close();

    }


}
