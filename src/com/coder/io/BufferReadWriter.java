package com.coder.io;

import java.io.*;

public class BufferReadWriter {

    public  void getCurrentPath(){
        System.out.println(this.getClass().getResource("/").getPath());
    }
    public void writeFlag() throws IOException {
        File file = new File(this.getClass().getResource("/").getPath(),"flag.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(file));
        BufferedWriter writer = new BufferedWriter(write);
        writer.write("123456");
        writer.flush();
        write.close();
        writer.close();
    }
    public String readFlag() throws IOException {
        File file = new File(this.getClass().getResource("/").getPath(),"flag.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        return bufferedReader.readLine();
    }

    public static void main(String[] args)  {
        try {
            String flag = new BufferReadWriter().readFlag();
            System.out.println(flag.equals("123456"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
