package com.zf.util;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.imageio.ImageIO;

public class ImageUtils {

	public static final String DEFAULT_IMAGE_NAME = "default.png";
	public static final int 	ALLOWNCE = 1;


	private static Robot robot ;
	private static Dimension screen;
	private BufferedImage defaultImg ;

	private Set<Point> cachePoints ;

	public ImageUtils(){
		try {
			robot = new Robot() ;
			screen = Toolkit.getDefaultToolkit().getScreenSize() ;
			defaultImg = defaultImg() ;
			cachePoints = new HashSet<Point>() ;
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public static  BufferedImage screenshot(){
		Rectangle rec = new Rectangle( 0 , 0 , (int)screen.getWidth() ,(int) screen.getHeight());
		BufferedImage img = robot.createScreenCapture(rec);
		return img ;
	}

	private BufferedImage defaultImg(){
		try {
			BufferedImage img  = ImageIO.read(getClass().getClassLoader()
					.getResourceAsStream(DEFAULT_IMAGE_NAME));
			return img; 
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null ;
	}

	public Point getDefaultImgPoint(){
		BufferedImage screenImg = screenshot();

		//先从缓存获取
		Point match = null ;
		match = matchFromCatch(screenImg);

		if(match == null){
			//从整个屏幕逐个点遍历
			outer : for (int i = 0 ; i < screenImg.getWidth() - defaultImg.getWidth() ; i++) {

				for (int j = 0; j < screenImg.getHeight() - defaultImg.getHeight()  ; j++) {

					if(match(i , j , screenImg)){
						match = new Point(i , j);
						break outer ;
					}

				}
			}
		}
		
		//将找到的Point加入缓存
		if(match != null)
			cachePoints.add(match);  
		
		return match ;
	}

	private Point matchFromCatch(BufferedImage screenImg){
		Iterator<Point> its = cachePoints.iterator();
		while(its.hasNext()){
			Point point = its.next();
			if(match(point.x , point.y , screenImg)){
				return point ;
			}
		}
		return null ;
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

}
