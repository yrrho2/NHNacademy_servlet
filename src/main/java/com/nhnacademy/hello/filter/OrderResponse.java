package com.nhnacademy.hello.filter;


public class OrderResponse implements Response {
    @Override
    public void doResponse(Request request) {
        System.out.println("###### response:Order #####");
        Member member = (Member) request.get("member");
        System.out.println("아이디:" + member.getId());
        System.out.println("이름:" + member.getName());
        System.out.println("등급:" + Member.Role.USER);
        System.out.println("주소:" + "대전 궁동로 어디즈음~");
        System.out.println("do something ... USER ...");
    }
}
