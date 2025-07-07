package com.demo.Student2.Service;

import org.springframework.stereotype.Service;

@Service
public class PathService {
	
	public int add(int a,int b) {
		return a+b;	
	}
	
	public boolean iseven(int a) {
		return (a%2==0);	
	}
	
	public boolean isodd(int a) {
		return (a%2!=0);	
	}
}