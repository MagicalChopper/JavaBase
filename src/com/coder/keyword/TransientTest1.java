package com.coder.keyword;

import com.coder.keyword.model.User1;

import java.io.*;

/**
 * 反序列化后类中static型变量username的值为当前JVM中对应static变量的值，
 *
 * 为修改后jmwang，而不是序列化时的值Alexia。
 */
@SuppressWarnings("ALL")
public class TransientTest1 {
    public static void main(String[] args) {

        User1 user = new User1();
        user.setUsername("Alexia");
        user.setPasswd("123456");

        System.out.println("read before Serializable: ");
        System.out.println("username: " + user.getUsername());
        System.err.println("password: " + user.getPasswd());

        try {
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream("C:\\Users\\LiuHao\\Desktop\\user.txt"));
            os.writeObject(user); // 将User对象写进文件
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            // 在反序列化之前改变username的值
            User1.username = "jmwang";

            ObjectInputStream is = new ObjectInputStream(new FileInputStream(
                    "C:\\Users\\LiuHao\\Desktop\\user.txt"));
            user = (User1) is.readObject(); // 从流中读取User的数据
            is.close();

            System.out.println("\nread after Serializable: ");
            System.out.println("username: " + user.getUsername());
            System.err.println("password: " + user.getPasswd());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
