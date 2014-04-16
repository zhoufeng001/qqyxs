package com.zf.util.key.dto;

import java.awt.Point;

import com.zf.util.YXSContext;

public class KeyTools {

	public static int BOTTOM_HEIGHT_ZB = 690 ;

	public static int ZB_WIDTH = 37 ;

	public static int JN_WIDTH = 165 ;

	private KeyTools(){} ;
	public static KeyTools tools = new KeyTools() ;
	public static KeyTools getInstance(){
		return tools ;
	}


	public  Point yry(){
		if(YXSContext.iconPoint  != null){
			Point point = new Point();
			point.x = YXSContext.iconPoint.x + 90;
			point.y = YXSContext.iconPoint.y + BOTTOM_HEIGHT_ZB ;
			return point ;
		}else{
			return null ;
		}
	}

	public  Point wq(){
		if(YXSContext.iconPoint  != null){
			Point point = new Point();
			point.x = YXSContext.iconPoint.x + 120 ;
			point.y = YXSContext.iconPoint.y + BOTTOM_HEIGHT_ZB ;
			return point ;
		}else{
			return null ;
		}
	}


	public  Point jgm(){
		if(YXSContext.iconPoint  != null){
			Point point = new Point();
			point.x = YXSContext.iconPoint.x + 55 ;
			point.y = YXSContext.iconPoint.y + BOTTOM_HEIGHT_ZB ;
			return point ;
		}else{
			return null ;
		}
	}


	public  Point fym(){
		if(YXSContext.iconPoint  != null){
			Point point = new Point();
			point.x = YXSContext.iconPoint.x + 20 ;
			point.y = YXSContext.iconPoint.y + BOTTOM_HEIGHT_ZB ;
			return point ;
		}else{
			return null ;
		}

	}
	
	
	public  Point on1(){
		if(YXSContext.iconPoint  != null){
			Point point = new Point();
			point.x = YXSContext.iconPoint.x + 70 ;
			point.y = YXSContext.iconPoint.y + 415 ;
			return point ;
		}else{
			return null ;
		}
		
	}
	
	public  Point on2(){
		if(YXSContext.iconPoint  != null){
			Point point = new Point();
			point.x = YXSContext.iconPoint.x + 215 ;
			point.y = YXSContext.iconPoint.y + 185;
			return point ;
		}else{
			return null ;
		}
		
	}
	
	public  Point on3(){
		if(YXSContext.iconPoint  != null){
			Point point = new Point();
			point.x = YXSContext.iconPoint.x + 420 ;
			point.y = YXSContext.iconPoint.y + 185 ;
			return point ;
		}else{
			return null ;
		}
		
	}
	
	
	public  Point on4(){
		if(YXSContext.iconPoint  != null){
			Point point = new Point();
			point.x = YXSContext.iconPoint.x + 600 ;
			point.y = YXSContext.iconPoint.y + 185 ;
			return point ;
		}else{
			return null ;
		}
		
	}
	
	
	
	public  Point on5(){
		if(YXSContext.iconPoint  != null){
			Point point = new Point();
			point.x = YXSContext.iconPoint.x + 750 ;
			point.y = YXSContext.iconPoint.y + 415 ;
			return point ;
		}else{
			return null ;
		}
		
	}
	
	
	
	public  Point jn1(){
		if(YXSContext.iconPoint  != null){
			Point point = new Point();
			point.x = YXSContext.iconPoint.x + 185 ;
			point.y = YXSContext.iconPoint.y + 595 ;
			return point ;
		}else{
			return null ;
		}
		
	}
	
	
	
	public  Point jn2(){
		if(YXSContext.iconPoint  != null){
			Point point = new Point();
			point.x = YXSContext.iconPoint.x + 185 ;
			point.y = YXSContext.iconPoint.y + 620 ;
			return point ;
		}else{
			return null ;
		}
		
	}
	
	
	
	public  Point jn3(){
		if(YXSContext.iconPoint  != null){
			Point point = new Point();
			point.x = YXSContext.iconPoint.x + 570 ;
			point.y = YXSContext.iconPoint.y + 550 ;
			return point ;
		}else{
			return null ;
		}
		
	}
	
	
	
	public  Point jn4(){
		if(YXSContext.iconPoint  != null){
			Point point = new Point();
			point.x = YXSContext.iconPoint.x + 670 ;
			point.y = YXSContext.iconPoint.y + 550 ;
			return point ;
		}else{
			return null ;
		}
		
	}
	
	
	
	public  Point lc_qd(){
		if(YXSContext.iconPoint  != null){
			Point point = new Point();
			point.x = YXSContext.iconPoint.x + 367 ;
			point.y = YXSContext.iconPoint.y + 505 ;
			return point ;
		}else{
			return null ;
		}
		
	}
	
	
	
	public  Point kg(){
		if(YXSContext.iconPoint  != null){
			Point point = new Point();
			point.x = YXSContext.iconPoint.x + 420 ;
			point.y = YXSContext.iconPoint.y + 550 ;
			return point ;
		}else{
			return null ;
		}
		
	}
	
	


}
