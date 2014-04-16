package com.zf.util;

import java.awt.AWTException;
import java.awt.Robot;

public class YXSRobot extends Robot {
	
	
	private static YXSRobot yxsrobot ;
	
	public static synchronized YXSRobot getInstance(){
		if(yxsrobot == null){
			try {
				yxsrobot = new YXSRobot();
			} catch (AWTException e) {
				e.printStackTrace();
			}  
		}
		return yxsrobot ;
	}

	private YXSRobot() throws AWTException {
		super();
	}

	public void pressMouse(int button){
		super.mousePress(button);
		super.mouseRelease(button);
	}
	
}
