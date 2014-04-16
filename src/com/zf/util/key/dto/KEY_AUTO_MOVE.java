package com.zf.util.key.dto;

import java.awt.Point;
import java.awt.event.KeyEvent;

import com.zf.util.YXSContext;
import com.zf.util.YXSUtils;
import com.zf.util.key.HotKeyEntity;
import com.zf.util.key.HotKeyManager;

/**
 * ����
 * @author zhoufeng
 *
 */
public class KEY_AUTO_MOVE extends HotKeyEntity{
	
	public static  boolean flag = false ;
	public static int SHUNXU = 0 ;
	public static int FIRST_JIANGE = 250  ;
	public static int JIANGE = 100 ;
	

	public KEY_AUTO_MOVE() {
		super(new Point(433, 703 ) ,YXSUtils.nextConstant()  ,KeyEvent.VK_1  ,flag ? "�ݼ����ƽ���" : "�ݼ����Ŀ�ʼ");
	}
	
	@Override
	public void execute() {  
		flag = !flag ;
		SHUNXU = 0 ;
		try {
			HotKeyManager.log.put("������" + (flag ? "�ݼ����Ŀ�ʼ" : "�ݼ����ƽ���") );
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static Point getNextPoint(){
		Point point = new Point();
		point.x = YXSContext.iconPoint.x +  FIRST_JIANGE + (SHUNXU * JIANGE);
		point.y = YXSContext.iconPoint.y + 420 ;
		SHUNXU++ ;
		return point ;
	}
	
	
}
