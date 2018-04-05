package com.coder.io;

import java.io.*;

/**
 * 关于IO流的一些常用
 */
public class AboutIOStream {

    /**
     * 在指定位置创建文件
     */
    public static void create(){
        File f=new File("c:"+File.separator+"Users"+File.separator+"10743"+File.separator+"Desktop"+File.separator+"test.txt");//为增加可移植性，建议使用File.separator
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("成功创建文件"+f.getName()+"位置在"+f.getPath());
    }

    /**
     * 删除指定位置的文件
     */
    public static void delete(){
        File f=new File("c:"+File.separator+"Users"+File.separator+"10743"+File.separator+"Desktop"+File.separator+"test.txt");
        if(f.exists()){//判断文件存不存在，如不存在就不用删除了
            f.delete();
            System.out.println("已删除文件"+f.getName());
        }else{
            System.out.println("文件不存在");
        }
    }

    /**
     * 先判断，如果指定位置存在某文件就删除不存在就创建。
     */
    public static void deleteOrCreate(){
        File f=new File("c:"+File.separator+"Users"+File.separator+"10743"+File.separator+"Desktop"+File.separator+"test.txt");
        if(f.exists()){
            f.delete();
            System.out.println("已删除文件"+f.getName());
        }else{
            try {
                f.createNewFile();
                System.out.println("成功创建文件"+f.getName()+"位置在"+f.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 创建文件夹
     */
    public static void createDir() {
        File f=new File("c:"+File.separator+"Users"+File.separator+"10743"+File.separator+"Desktop"+File.separator+"test");
        f.mkdir();//创建文件夹
        System.out.println("成功创建文件夹"+f.getName()+"位置在"+f.getPath());

        if(f.isDirectory()){
            System.out.println(f.getPath()+"是目录");
        }else{
            System.out.println(f.getPath()+"不是目录");
        }
    }

    /**
     * 列出指定目录全部文件名,包括文件夹名字和文件的名字
     */
    public static void showList() {
        File f=new File("c:"+File.separator+"Users"+File.separator+"10743"+File.separator+"Desktop");
        String[] str=f.list();
        //文件名
        for(String s:str){
            System.out.println(s);
        }
        //完整路径
        File[] files=f.listFiles();
        for(File file:files){
            System.out.println(file);
        }
    }

    /**
     * 列出指定目录的全部文件完全路径。//完整路径
     */
    public static void showCompletePath() {
        File f=new File("c:"+File.separator+"Users"+File.separator+"10743"+File.separator+"Desktop");
        File[] files=f.listFiles();
        for(File file:files){
            System.out.println(file);
        }
    }

    /**
     * 如果给定了一个目录，则要求把此目录中的全部文件都列出来，包括子文件夹下的文件
     */
    public static void showAllByRecursion (File f) {
        //f = new File("c:"+File.separator+"Users"+File.separator+"10743"+File.separator+"Desktop");
        if (f != null) {
            if (f.isDirectory()) {
                File[] files = f.listFiles();
                if (files != null) {
                    for (File file : files) {
                        showAllByRecursion(file);//递归
                    }
                }
            } else {
                System.out.println(f);
            }
        }
    }

    /**
     *  字节流写入
     */
    @SuppressWarnings("Duplicates")
    public static void writeByByteArray() throws IOException{
        File f = new File("c:"+File.separator+"Users"+File.separator+"10743"+File.separator+"Desktop"+File.separator+"test.txt");
        //数组缓冲写入
        OutputStream out=new FileOutputStream(f);//如果文件不存在会自动创建
        String str="Hello World";
        byte[] b=str.getBytes();
        out.write(b);//因为是字节流，所以要转化成字节数组进行输出
        out.close();
    }

    /**
     * 追加信息，OutputStream out=new FileOutputStream(f,true)
     */
    public static void fileAppend() throws IOException {
        File f = new File("c:"+File.separator+"Users"+File.separator+"10743"+File.separator+"Desktop"+File.separator+"test.txt");
        OutputStream out=new FileOutputStream(f,true);//追加内容
        String str="\r\nHello World";
        byte[] b=str.getBytes();
        for(int i=0;i<b.length;i++){
            out.write(b[i]);
        }
        out.close();
    }

    /**
     * byte数组缓冲读文件
     */
    public static void readByByteArray() throws IOException{
        File f = new File("c:"+File.separator+"Users"+File.separator+"10743"+File.separator+"Desktop"+File.separator+"test.txt");
        InputStream in=new FileInputStream(f);
        byte[] b=new byte[1024];
        int len=in.read(b);
        in.close();
        System.out.println(new String(b,0,len));
    }

    /**
     * 自定义数组大小读（知道文件的大小）根据文件大小定义数组长度
     */
    public static void readByFileLength() throws IOException{
        File f = new File("c:"+File.separator+"Users"+File.separator+"10743"+File.separator+"Desktop"+File.separator+"test.txt");
        InputStream in=new FileInputStream(f);
        byte[] b=new byte[(int) f.length()];
        in.read(b);
        in.close();
        System.out.println(new String(b));
    }

    /**
     * 一个字节一个字节读入
     */
    public static void readBySingleByte() throws IOException{
        File f = new File("c:"+File.separator+"Users"+File.separator+"10743"+File.separator+"Desktop"+File.separator+"test.txt");
        InputStream in=new FileInputStream(f);
        byte[] b=new byte[(int) f.length()];
        for(int i=0;i<b.length;i++){
            b[i]=(byte) in.read();
        }
        in.close();
        System.out.println(new String(b));
    }


    /**
     *  以上只适合知道文件大小的情况，此方法为不知道文件大小的情况
     */
       public static void readByByteArrayUnKnowFileLen() throws IOException{
        File f = new File("c:"+File.separator+"Users"+File.separator+"10743"+File.separator+"Desktop"+File.separator+"test.txt");
        InputStream in=new FileInputStream(f);
        byte[] b=new byte[1024];
        int temp=0;
        int len=0;
        while((temp=in.read())!=-1){//-1为文件读完的标志
            b[len]=(byte) temp;
            len++;
        }
        in.close();
        System.out.println(new String(b,0,len));
    }

    /**
     * 字符流写文件
     */
    public static void writeByChar() throws IOException{
        File f = new File("c:"+File.separator+"Users"+File.separator+"10743"+File.separator+"Desktop"+File.separator+"test.txt");
        Writer out=new FileWriter(f);
        String str="你好";
        System.out.println(str.getBytes().length);
        out.write(str);
        out.close();
    }


    /**
     * 字符流写文件，在默认情况下再次输出会覆盖，追加的方法也是在构造函数上加上追加标记
     */
    public static void writeAppendByChar() throws IOException{
        File f = new File("c:"+File.separator+"Users"+File.separator+"10743"+File.separator+"Desktop"+File.separator+"test.txt");
        Writer out=new FileWriter(f,true);//追加
        String str="\r\n你好";
        out.write(str);
        out.close();
    }

    /**
     * 以字符数组的形式读取出数据
     */
    public static void readByChar() throws IOException{
        File f = new File("c:"+File.separator+"Users"+File.separator+"10743"+File.separator+"Desktop"+File.separator+"test.txt");
        Reader input=new FileReader(f);
        char[] c=new char[1024];
        int len=input.read(c);
        input.close();
        System.out.println(new String(c,0,len));
    }

    /**
     * 以字符的形式用循环方式，判断是否读到底,读取出数据
     */
    public static void readByCharAndWhile() throws IOException{
        File f = new File("c:"+File.separator+"Users"+File.separator+"10743"+File.separator+"Desktop"+File.separator+"test.txt");
        Reader input=new FileReader(f);
        char[] c=new char[1024];
        int temp;
        int len=0;
        while((temp=input.read())!=-1){
            c[len]=(char) temp;
            len++;
        }
        input.close();
        System.out.println(new String(c,0,len));
    }



}
