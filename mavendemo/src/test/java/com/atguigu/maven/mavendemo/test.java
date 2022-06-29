package com.atguigu.maven.mavendemo;

import org.junit.Test;

public class test {

    @Test
    public  void test(){
        hello hello = new hello();
        String maven = hello.hello("Maven");
        System.out.println(maven);
    }
}
