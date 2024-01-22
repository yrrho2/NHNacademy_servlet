package com.nhnacademy.hello.filter;

import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class MyPageFilter implements Filter2 {

    @Override
    public void doFilter(Request request,FilterChain filterChain) {
        if(request.getPath().equals("/mypage")){
            Member member = (Member) request.get("member");
            if(member.hasRole(Member.Role.USER)){
                System.out.println("path:" + request.getPath() + " member role has USER : true");
                filterChain.doFilter(request);
            }else{
                System.out.println("path:" + request.getPath() + " member role has USER : false");
            }
        }else{
            System.out.println("MyPageCheckFilter : 다음 필터로 넘김! ");

            //다음 filter로 넘김
            filterChain.doFilter(request);
        }
    }

}