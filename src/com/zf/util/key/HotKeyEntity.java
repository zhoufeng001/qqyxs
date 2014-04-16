package com.zf.util.key;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.InputEvent;

import com.zf.util.YXSRobot;
import com.zf.util.key.dto.KEY_AUTO_MOVE;
import com.zf.wg._3v3Start;

public abstract class HotKeyEntity {

	protected int bs ;

	protected int hotkey ;

	protected YXSRobot robot ;

	public Point point ;

	protected  String opreationName ;

	public HotKeyEntity( Point point , int bs , int hotkey ,String opreationName  ){
		this.point = point ;
		this.hotkey = hotkey ;
		this.bs = bs ;
		this.opreationName = opreationName ;
		robot = YXSRobot.getInstance() ;
	}

	/**
	 * 默认鼠标移动到光标处  并点击左键
	 */
	public void execute() {
		Point  currentPoint = MouseInfo.getPointerInfo().getLocation() ;
		
		if( KEY_AUTO_MOVE.flag ){
			Point nextPoint = KEY_AUTO_MOVE.getNextPoint() ;
			robot.mouseMove(nextPoint.x, nextPoint.y) ;
			robot.pressMouse(InputEvent.BUTTON1_MASK) ;  
			try {
				HotKeyManager.log.put("操作：" + "选第" + KEY_AUTO_MOVE.SHUNXU + "张牌" );
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			if(_3v3Start.yujiIsStart){  
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				robot.mouseMove((int)currentPoint.getX() , (int)currentPoint.getY()) ;
			}
		}
		
		robot.mouseMove(point.x, point.y) ;
		robot.pressMouse(InputEvent.BUTTON1_MASK) ;  
		if(_3v3Start.yujiIsStart){
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			robot.mouseMove((int)currentPoint.getX() , (int)currentPoint.getY()) ;
		}

		try {
			HotKeyManager.log.put("操作：" + opreationName );
		} catch (InterruptedException e) {  
			e.printStackTrace();
		}
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

}
