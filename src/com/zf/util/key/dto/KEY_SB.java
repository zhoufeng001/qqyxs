package com.zf.util.key.dto;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;

import com.zf.util.YXSUtils;
import com.zf.util.key.HotKeyEntity;

/**
 * 点击鼠标所在的位置
 * @author zhoufeng
 *
 */
public class KEY_SB extends HotKeyEntity{

	Point  currentPoint = MouseInfo.getPointerInfo().getLocation() ;
	
	public KEY_SB() {
		super(new Point(433, 703 ) ,YXSUtils.nextConstant()  ,KeyEvent.VK_NUMPAD0 ,"原地");
	
		
	}
	
	@Override
	public void execute() {  
		Point  currentPoint = MouseInfo.getPointerInfo().getLocation() ;
		super.point = currentPoint ;
		super.execute();
		System.out.println("SB");
	}
	
}
