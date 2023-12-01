package com.cybergaming424;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DayOne implements Day{

    private File input;
    private Scanner fileReader;

    public DayOne(String path){
        input = new File(path);
    }

    @Override
    public void partOne() {

        int solution = 0;

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("src/main/resources/dayOneInput.txt"));
            String line = reader.readLine();
            while (line != null) {

                char[] postcheck = new char[2];
                char[] precheck = line.toCharArray();
                for (int i = 0; i < precheck.length; i++) {
                    if (Character.isDigit(precheck[i])) {
                        postcheck[0] = precheck[i];
                        break;
                    }
                }
                for (int i = precheck.length - 1; i > -1; i--) {
                    if (Character.isDigit(precheck[i])) {
                        postcheck[1] = precheck[i];
                        break;
                    }
                }
                String combined = String.valueOf(postcheck);
                solution += Integer.parseInt(combined);
                line = reader.readLine();

            }

        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(solution);

    }

    @Override
    public void partTwo() {

    }
}
