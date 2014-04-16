package com.zf.util.key.dto;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import com.zf.util.ImageUtil2;
import com.zf.util.YXSUtils;
import com.zf.util.key.HotKeyEntity;
import com.zf.util.key.HotKeyManager;

/**
 * 清零刘策选牌位置
 * @author zhoufeng
 *
 */
public class KEY_LC_QN extends HotKeyEntity{


	public static ImageUtil2 iu = new ImageUtil2() ;

	public static List<Point> points  = new ArrayList<Point>() ; 

	public static int index = 0 ;

	public KEY_LC_QN() {
		super(new Point(433, 703 ) ,YXSUtils.nextConstant()  ,KeyEvent.VK_3,"检测坐标");
	}

	@Override
	public void execute() {
			index = 0;
			points = iu.getPoints() ;
			try {
				HotKeyManager.log.put("操作：" + "刘策开启选牌" +( points == null ? 0 : points.size()));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

	public static Point nextPoint(){
		if(points != null && index < points.size()){  
			return points.get(index++) ;
		}
		return null ;
	}



}
