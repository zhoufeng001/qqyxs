package com.zf.util.key.dto;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import com.zf.util.YXSUtils;
import com.zf.util.key.HotKeyEntity;
import com.zf.util.key.HotKeyManager;
import com.zf.wg._3v3Start;

/**
 * ����ѡ��
 * @author zhoufeng
 *
 */
public class KEY_LC_XP extends HotKeyEntity{

	public static int SHUNXU = 1 ;

	public KEY_LC_XP() {
		super(new Point(490, 611 ) ,YXSUtils.nextConstant()  ,KeyEvent.VK_4 ,"����1");
	}

	/**
	 * Ĭ������ƶ�����괦  ��������
	 */
	public void execute() {
		Point  currentPoint = MouseInfo.getPointerInfo().getLocation() ;

		Point paiPoint = KEY_LC_QN.nextPoint() ;
		
		if(currentPoint != null){
			robot.mouseMove(paiPoint.x, paiPoint.y) ;
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
				HotKeyManager.log.put("������" + "����ѡ��" + KEY_LC_QN.index );
			} catch (InterruptedException e) {  
				e.printStackTrace();
			}
		}
	}



}
