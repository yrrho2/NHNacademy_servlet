package com.nhnacademy.hello.filter;

public class HttpRequest {
    private final FilterChain filterChain = new FilterChain();

    public HttpRequest(){
        initFilter();
    }

    public void doRequest(Request request){
        filterChain.doFilter(request);
    }

    private void initFilter(){
        filterChain.addFilter(new MyPageFilter());
        filterChain.addFilter(new AdminPageFilter());
        filterChain.addFilter(new OrderPageFilter());
    }

}