package com.coder.test;


import java.io.*;
import java.net.URL;

public class Test {
    public static void test(String str){
        switch (str){
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            case "C":
                System.out.println("C");
                break;
        }
    }

    public static void main(String[] args) throws IOException {
//        test("2134123");
//        throw new RuntimeException("1111");
//        List list = new ArrayList<>();
//        list.add(null);
//        list.add(null);
//        list.add(null);
//        list.add(null);
//        list.add(null);
//        list.add(null);
//        System.out.println(list.size());
//        System.out.println(list);
//        String text = "D";
//        for(int i =0;i<9;i++){
//            String[] filters = {"A","B","C"};
//            int flag = 0;
//            for (String filter : filters) {
//                if(text.startsWith(filter)){
//                    flag = 1;
//                    break;
//                }
//            }
//            if(flag==1){
//                continue;
//            }
//            System.out.println(11111111);
//        }
        recordError();
    }

    public static void recordError() throws IOException {
        File file = new File("C:/Users/LiuHao/Desktop/errorKeys.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file));
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write("哈哈哈哈");
        bufferedWriter.newLine();
        bufferedWriter.write("嘻嘻嘻嘻");
        bufferedWriter.newLine();
        bufferedWriter.write("呼呼呼呼");
        bufferedWriter.newLine();
        bufferedWriter.close();
        outputStreamWriter.close();
    }


}
