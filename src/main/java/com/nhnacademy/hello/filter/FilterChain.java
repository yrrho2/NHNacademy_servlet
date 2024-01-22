package com.nhnacademy.hello.filter;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FilterChain {
    private List<Filter2> filters = new LinkedList<>();
    private Iterator iterator;

    public void addFilter(Filter2 filter){
        this.filters.add(filter);
        iterator = filters.iterator();
    }

    public void doFilter(Request request){

        if(iterator.hasNext()){
            Filter2 nextFilter = (Filter2) iterator.next();
            nextFilter.doFilter(request,this);
        }else{

            //요청 결과값 출력
            if(request.getPath().equals("/mypage")){
                new MyPageResponse().doResponse(request);
            }else if(request.getPath().equals("/admin")){
                new AdminPageResponse().doResponse(request);
            }else if(request.getPath().equals("/order")){
                new OrderResponse().doResponse(request);
            }else {
                new NotFoundResponse().doResponse(request);
            }

        }
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse) {
    }
}