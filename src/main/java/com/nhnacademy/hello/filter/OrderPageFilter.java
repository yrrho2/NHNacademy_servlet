package com.nhnacademy.hello.filter;

import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.Objects;

public class OrderPageFilter  implements Filter2 {

    @Override
    public void doFilter(Request request, FilterChain filterChain) {

        if (request.getPath().equals("/order")) {
            Member member = (Member) request.get("member");
            if (Objects.nonNull(member)) {
                if (!member.hasRole(Member.Role.NONE)) {
                    System.out.println("path:" + request.getPath() + " : has Member");
                    filterChain.doFilter(request);
                } else {
                    System.out.println("path:" + request.getPath() + " : has not Member");
                }
            }
        } else {
            System.out.println("OrderPageCheckFilter : 다음 필터로 넘김! ");
            filterChain.doFilter(request);
        }
    }
}
