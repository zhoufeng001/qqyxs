package com.zf.util;

import java.util.concurrent.atomic.AtomicInteger;

public class YXSUtils {
	
	private static AtomicInteger constant = new AtomicInteger(0) ;  
	
	public static int nextConstant(){
		return constant.incrementAndGet() ;
	}

}
