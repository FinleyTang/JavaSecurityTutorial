package com.example;

import java.io.FileOutputStream;

public class JavaWriteFile {
    public static void main(String args[] ){
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\ftang\\file.txt");
            String s = "this is a test";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("success");
        }catch (Exception e){System.out.println(e);}
    }
}
