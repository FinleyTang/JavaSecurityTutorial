package com.example;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaReadFile {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\ftang\\file.txt");

        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}
