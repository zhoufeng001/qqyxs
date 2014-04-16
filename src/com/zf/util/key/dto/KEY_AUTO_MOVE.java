package com.zf.util.key.dto;

import java.awt.Point;
import java.awt.event.KeyEvent;

import com.zf.util.YXSContext;
import com.zf.util.YXSUtils;
import com.zf.util.key.HotKeyEntity;
import com.zf.util.key.HotKeyManager;

/**
 * 武器
 * @author zhoufeng
 *
 */
public class KEY_AUTO_MOVE extends HotKeyEntity{
	
	public static  boolean flag = false ;
	public static int SHUNXU = 0 ;
	public static int FIRST_JIANGE = 250  ;
	public static int JIANGE = 100 ;
	

	public KEY_AUTO_MOVE() {
		super(new Point(433, 703 ) ,YXSUtils.nextConstant()  ,KeyEvent.VK_1  ,flag ? "虞姬给牌结束" : "虞姬给拍开始");
	}
	
	@Override
	public void execute() {  
		flag = !flag ;
		SHUNXU = 0 ;
		try {
			HotKeyManager.log.put("操作：" + (flag ? "虞姬给拍开始" : "虞姬给牌结束") );
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
