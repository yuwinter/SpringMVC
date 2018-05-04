package com.winter.core.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.winter.annotation.MyController;
import com.winter.annotation.MyRequestMapping;
import com.winter.annotation.MyRequestParam;

@MyController
@MyRequestMapping("/test")
public class TestController {

     @MyRequestMapping("/doTest")
    public void test1(HttpServletRequest request, HttpServletResponse response,
            @MyRequestParam("param") String param){
        System.out.println(param);
        try {
            response.getWriter().write( "doTest method success! param:"+param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     @MyRequestMapping("/doTest2")
    public void test2(HttpServletRequest request, HttpServletResponse response){
        try {
            response.getWriter().println("doTest2 method success!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}