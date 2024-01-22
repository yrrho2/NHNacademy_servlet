package com.nhnacademy.hello.filter;

public class NotFoundResponse implements Response {
    @Override
    public void doResponse(Request request) {
        System.out.println("###### response:404 #####");
        System.out.println("Page 404 not Found");
    }
}
