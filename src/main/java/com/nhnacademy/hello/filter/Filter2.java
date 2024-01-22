package com.nhnacademy.hello.filter;

import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public interface Filter2 {
    void doFilter(Request request, FilterChain filterChain);

}