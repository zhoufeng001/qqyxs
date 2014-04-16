package com.zf.util.key.dto;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;

import com.zf.util.YXSUtils;
import com.zf.util.key.HotKeyEntity;
import com.zf.util.key.HotKeyManager;
import com.zf.wg._3v3Start;

/**
 * 刘彻的确定
 * @author zhoufeng
 *
 */
public class KEY_ZB_LC_QD extends HotKeyEntity{

	public KEY_ZB_LC_QD() {
		super(new Point(377, 515 ) ,YXSUtils.nextConstant()  ,KeyEvent.VK_2 ,"刘彻确定");
	}

	@Override
	public void execute() {
		super.execute();


		/*
		 * 出牌
		 */
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
			HotKeyManager.log.put("操作：" + opreationName);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		/**
		 * 清零
		 */
		KEY_LC_QN.index = 0;
		try {
			HotKeyManager.log.put("操作：" + "刘策关闭选牌" );
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
