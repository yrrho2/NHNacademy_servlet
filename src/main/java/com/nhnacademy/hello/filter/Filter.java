package com.nhnacademy.hello.filter;
public interface Filter {
    void doFilter(Request request, FilterChain filterChain);
}