package com.zf.test;

import java.awt.Point;

import com.zf.util.ImageUtils;

public class Test03 {
	
	public void test(ImageUtils iu){
		long start = System.currentTimeMillis() ;
		Point point = iu.getDefaultImgPoint();
		long end = System.currentTimeMillis() ;
		
		System.out.println("time:" + (end  - start));  
		
		System.out.println(point);
	}

	public static void main(String[] args) {
		
		
		
		ImageUtils iu = new ImageUtils() ;
		
		Test03 t = new Test03(); 
		
		t.test(iu);
		t.test(iu);
		t.test(iu);
		t.test(iu);
		t.test(iu);
		
		
	}
	
}
