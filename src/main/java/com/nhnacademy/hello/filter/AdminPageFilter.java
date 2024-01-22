package com.nhnacademy.hello.filter;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.Objects;
public class AdminPageFilter implements Filter2{

    @Override
    public void doFilter(Request request, FilterChain filterChain) {

        if( request.getPath().equals("/admin") ){
            Member member = (Member) request.get("member");
            if(Objects.nonNull(member)){
                if( member.hasRole(Member.Role.ADMIN) ){
                    System.out.println("path:" + request.getPath() + " : has ADMIN");
                    filterChain.doFilter(request);
                }else {
                    System.out.println("path:" + request.getPath() + " : has not ADMIN");
                }
            }
        }else{
            System.out.println("AdminPageCheckFilter : 다음 필터로 넘김! ");
            filterChain.doFilter(request);
        }
    }

}