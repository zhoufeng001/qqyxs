package com.zf.util;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class ImageUtil2 {


	static  Point p1 ;
	static  Point p2 ;
	static  Point p3 ;
	static  Point p4 ;
	private static BufferedImage defaultImg ;
	public static final String DEFAULT_IMAGE_NAME = "vvvv.gif";
	public static final int 	ALLOWNCE = 1;
	
	private ImageUtils iu = new ImageUtils() ;
	
	
	static{
		try {
			defaultImg = ImageIO.read(ImageUtil2.class.getClassLoader()
					.getResourceAsStream(DEFAULT_IMAGE_NAME));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initPoints(){
		YXSContext.iconPoint = iu.getDefaultImgPoint() ;
		System.out.println(YXSContext.iconPoint);
		p1 = new Point() ;
		p2 = new Point() ;
		p3 = new Point() ;
		p4 = new Point() ;
		p1.x = YXSContext.iconPoint.x + 170 ;
		p2.x = YXSContext.iconPoint.x + 620 ;
		p3.x = YXSContext.iconPoint.x + 170 ;
		p4.x = YXSContext.iconPoint.x + 620 ;
		p1.y = YXSContext.iconPoint.y + 339 ;
		p2.y = YXSContext.iconPoint.y + 339 ;
		p3.y = YXSContext.iconPoint.y + 490 ;
		p4.y = YXSContext.iconPoint.y + 490 ;
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}


	public List<Point> getPoints(){
		List<Point> points = new ArrayList<Point>() ;
		initPoints() ;
		BufferedImage screen = ImageUtils.screenshot() ;
		for (int i = p1.x  ; i < p2.x ; i++) {
			for (int j = p1.y ; j < p3.y  ; j++) {
				if(match(i , j , screen)){
					points.add(new Point(i + 13 , j + 50));
				}
			}
		}
		return points ;
	}
	
	private boolean match(int x , int y , BufferedImage screenImg){
		for (int m = 0 ; m < defaultImg.getWidth() ; m += ALLOWNCE) {
			for (int n = 0 ; n < defaultImg.getHeight() ; n += ALLOWNCE) {
				if(screenImg.getRGB(x + m, y + n) != defaultImg.getRGB(m, n)){
					return false ;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		ImageUtil2 iu = new ImageUtil2() ;
		
		try {
			Thread.sleep(3000) ;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		List<Point> ps = iu.getPoints() ;
		System.out.println(ps.size());
		for (Point point : ps) {
			System.out.println(point.x + " " + point.y);
		}
		  
	}
	



}
