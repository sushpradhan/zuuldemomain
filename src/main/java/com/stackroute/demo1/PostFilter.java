package com.stackroute.demo1;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PostFilter  extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("Inside post filter....................");
		return null;
	}

	@Override
	public String filterType() {
		
		// TODO Auto-generated method stub
		return "post";
	}

	@Override
	public int filterOrder() {
		return 1;
	}


}
