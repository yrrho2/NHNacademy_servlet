package com.nhnacademy.hello.filter01;
public interface Filter {
    void doFilter(Request request, FilterChain filterChain);
}