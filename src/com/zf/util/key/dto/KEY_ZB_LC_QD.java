package com.zf.util.key.dto;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;

import com.zf.util.YXSUtils;
import com.zf.util.key.HotKeyEntity;
import com.zf.util.key.HotKeyManager;
import com.zf.wg._3v3Start;

/**
 * ������ȷ��
 * @author zhoufeng
 *
 */
public class KEY_ZB_LC_QD extends HotKeyEntity{

	public KEY_ZB_LC_QD() {
		super(new Point(377, 515 ) ,YXSUtils.nextConstant()  ,KeyEvent.VK_2 ,"����ȷ��");
	}

	@Override
	public void execute() {
		super.execute();


		/*
		 * ����
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
			HotKeyManager.log.put("������" + opreationName);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		/**
		 * ����
		 */
		KEY_LC_QN.index = 0;
		try {
			HotKeyManager.log.put("������" + "���߹ر�ѡ��" );
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
