package com.zf.util.key.dto;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;

import com.zf.util.YXSUtils;
import com.zf.util.key.HotKeyEntity;
import com.zf.util.key.HotKeyManager;
import com.zf.wg._3v3Start;

/**
 * ³öÅÆ
 * @author zhoufeng
 *
 */
public class KEY_CP extends HotKeyEntity{

	public KEY_CP() {
		super(new Point(670 , 563), YXSUtils.nextConstant()  ,KeyEvent.VK_SPACE ,"³öÅÆ");
	}
	
	@Override
	public void execute() {
		Point  currentPoint = MouseInfo.getPointerInfo().getLocation() ;
		robot.mouseMove(point.x, point.y);
		robot.pressMouse(HotKeyManager.MOUSE_RIGHT);
		if(_3v3Start.yujiIsStart){
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			robot.mouseMove((int)currentPoint.getX() , (int)currentPoint.getY()) ;
		}
		try {
			HotKeyManager.log.put("²Ù×÷£º" + opreationName);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
